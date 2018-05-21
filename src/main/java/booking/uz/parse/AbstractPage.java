package booking.uz.parse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class AbstractPage {
    protected WebDriver driver ;

    public AbstractPage(WebDriver driver) {
        this.driver = driver ;
    }
}


 class HomePage extends AbstractPage {

    public HomePage (WebDriver driver) {
        super(driver) ;
        PageFactory.initElements(driver,this) ;
    }


    @FindBy(xpath=".//*[@id='stations_from']//div[1]")
    private WebElement suggestChoiceStationFrom;

    @FindBy (xpath=".//*[@id='stations_till']//div[1]")
    private WebElement suggestChoiceStationTill;


    @FindBy (xpath=".//*[@id='station_from']/input")
    private WebElement textFieldFrom ;

    @FindBy (xpath=".//*[@id='station_till']/input")
    private WebElement textFieldTill ;

    @FindBy (xpath="//button[@name='search']")
    private WebElement searchButton;

    @FindBy (xpath=".//*[@id='date_dep']")
    private WebElement chooseFieldDateTrip;

    public void searchTrains  (String stationFrom , String stationTill , String date) {
        textFieldFrom.sendKeys(stationFrom);
        textFieldTill.sendKeys(stationTill);
        suggestChoiceStationFrom.click();
        suggestChoiceStationTill.click();
        setDate(date);
        searchButton.click();
        //return new TrainPage(driver)  ;
    }

    private  void setDate (String date) {
        chooseFieldDateTrip.clear();
        chooseFieldDateTrip.sendKeys(date);

    }
}

class ResultPage extends AbstractPage{

    @FindBy (xpath="//*[@id='ts_res_tbl']//a")
    private List<WebElement> numberTrains ;


    public ResultPage(WebDriver driver) {
        super(driver) ;
        PageFactory.initElements(driver,this) ;

    }
    public void getNumberTrains () {
        for (WebElement e : numberTrains) {
            System.out.println(e.getText()) ;
        }

    }
}

 class PageTest {
    private WebDriver driver ;
    private final String baseUrl = "http://booking.uz.gov.ua/ru/" ;
    private HomePage homePage ;
  //  private TrainPage trainPage ;
    private ResultPage resultPage ;


    public void setUp () {
        driver = new SafariDriver();
        driver.get(baseUrl);
    }


    public void searchTrain () {
        homePage = new HomePage (driver) ;
        //trainPage=new TrainPage(driver) ;
        resultPage = new ResultPage(driver) ;
       homePage.searchTrains ("Львов","Киев" ,"29.11.2013" );
        resultPage.getNumberTrains () ;

    }

     public static void main(String[] args) {
         PageTest pageTest = new PageTest();
         pageTest.setUp();
         try {
             Thread.sleep(4000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         pageTest.searchTrain();
     }
}