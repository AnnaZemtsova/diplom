package booking.uz.parse;
import org.json.JSONObject;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BookingUzParse implements TrainData {

        static String html   = "";
        static String cookie = "";
        static String token  = "";
        static String error  = "";

        static Map<String, List<String>> headers = null;

    /*
  тут вся фигня происходит
  зачем парсить куки я не понимаю, без них работает также, но видимо смысл в них есть

    //  String from = getStationId(fromName);
     // String to = getStationId(toName);
     эта штука получает индексы городов - этти методы тут не работает, поэтому как виидишь в запросе, я тупо
     беру с букинга эти цифры и вручную пишу, чтобы проверить есть ли конект.
     в результате оно возвращет хтмл, идентичной что и на букинге в ресурсах
     но блока с таблицей поездов просто нет, он пропущен.
   */
    static String getDataw(String fromName, String toName, String date) {
        fetchHtml();
//           parseCookie();
        parseToken();
        //  String from = getStationId(fromName);
        // String to = getStationId(toName);
        StringBuilder json = new StringBuilder();
        try {
            URL url = new URL("https://booking.uz.gov.ua/en/?from=2208001&to=2204001&date=2018-04-08&time=00%3A00&url=train-list");//"http://booking.uz.gov.ua/en/");//"http://booking.uz.gov.ua/en/purchase/search/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestProperty("Cookie", cookie);
            conn.setRequestProperty("GV-Token", token);
            conn.setRequestProperty("GV-Ajax", "1");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         // conn.setRequestProperty("Referer", "http://booking.uz.gov.ua/en/?from=2204001&to=2200001&date=2018-03-25&time=00%3A00&url=train-list");
            conn.setRequestMethod("GET");
            JSONObject data = new JSONObject();
            data.put("from","2204001");
            data.put("to","2200001");
            data.put("date","2018-03-25");
            data.put("time","00%3A00");
           // data.put("url","train-list");
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            //OutputStreamWriter wr= new OutputStreamWriter(conn.getOutputStream());

            System.out.println("dsfasfs");
          //  wr.write(data.toString());
           //String urlParameters = MessageFormat.format("station_id_from={0}&station_id_till={1}&date_dep={2}" +
             //      "&time_dep=00:00&time_dep_till=24:00", 2204001, 2200001, date);
            conn.setDoOutput(true);

         //   DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
           //wr.writeBytes(urlParameters);
          wr.flush();
           // wr.close();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                json.append(line);
                System.out.println(line);
            }
            rd.close();
        } catch (Exception e) {
            error = e.getMessage();
        }
        return json.toString();
    }


    static String getData(String fromName, String toName, String date,String time,String urli) {
        fetchHtml();
//        parseCookie();
     //   parseToken();
     //   String from = getStationId(fromName);
       // String to = getStationId(toName);
        String json = "";
        try {
            URL url = new URL("https://booking.uz.gov.ua/en/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Cookie", cookie);
            conn.setRequestProperty("GV-Token", token);
            conn.setRequestProperty("GV-Ajax", "1");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Referer","https://booking.uz.gov.ua/en/");
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("from","2204001");
            conn.addRequestProperty("to","2200001");
            conn.addRequestProperty("date","2018-04-26");
            conn.addRequestProperty("time","00%3A00");
            conn.addRequestProperty("url","train-list");
            conn.setDoOutput(true);

            BufferedReader rdy = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rdy.readLine()) != null) {
                System.out.println(json);
                json += line;
            }
         JSONObject data = new JSONObject();
            data.put("from","2204001");
            data.put("to","2200001");
            data.put("date","2018-04-21");
            data.put("time","00%3A00");
            data.put("url","train-list");
            OutputStreamWriter wry= new OutputStreamWriter(conn.getOutputStream());
            wry.write(data.toString());
            wry.flush();
            wry.close();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = rd.readLine()) != null) {
                System.out.println("jh"+json);
                json += line;
            }
            rd.close();
        } catch (Exception e) {
            error = e.getMessage();
        }
        return json;
    }


    static void fetchHtml() {
            try {
                URL url = new URL("http://booking.uz.gov.ua/en/");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                headers = conn.getHeaderFields();
                String line;
                while ((line = rd.readLine()) != null) {
                    html += line;
                }
                rd.close();
            } catch (Exception e) {
                error = e.getMessage();
            }
        }

        static void parseCookie() {
            List<String> cookies = headers.get("Set-Cookie");
            for (String current_cookie : cookies) {
                if (current_cookie.startsWith("_gv_sessid")) {
                    cookie = current_cookie;
                    break;
                }
            }
        }

        static void parseToken() {
            String adapter = "var token;localStorage={setItem:function(key, value){if(key==='gv-token')token=value}};";
            Pattern pattern = Pattern.compile("\\$\\$_=.*~\\[\\];.*\"\"\\)\\(\\)\\)\\(\\);");
            Matcher matcher = pattern.matcher(html);
            if (matcher.find()) {
                String obfuscated = matcher.group(0);
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("JavaScript");
                try {
                    engine.eval(adapter + obfuscated);
                } catch (ScriptException e) {
                    error = e.getMessage();
                }
                token = engine.get("token").toString();
            }
        }

        static String getStationId(String name) {
            String json = "";
            try {
                URL url = new URL("http://booking.uz.gov.ua/en/train_search/");//"http://booking.uz.gov.ua/en/purchase/station/" + name + "/");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    json += line;
                }
                rd.close();
            } catch (Exception e) {
                error = e.getMessage();
            }
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName("JavaScript");
            engine.put("json", json);
            try {
                engine.eval("var station_id = JSON.parse(json).value[0].station_id");
            } catch (ScriptException e) {
                error = e.getMessage();
            }
            return engine.get("station_id").toString();
        }


        static String getDatua(String fromName, String toName) {return "kjh";
           // return getData(fromName, toName, new SimpleDateFormat("MM.dd.yyyy").format(new Date()));
        }

        public static void main(String[] args) {

            String data;
            data = getData("Харьков", "Киев", "2018-04-26","00%3A00","train-list");

            System.out.println(data);

        }

    }

