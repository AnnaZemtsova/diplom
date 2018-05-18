var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
var labelIndex = 0;
var number = 0;


//____________________________________________________________________________________
/*
   создаем новую карту и инициализируем ее
   добавляем объекты геокодирования, начальный центр и слушателя нажатий
 */
function initMap() {

    var geocoder = new google.maps.Geocoder;
    var infowindow = new google.maps.InfoWindow;

    var myLatLng = {lat: 35.363, lng: 35.044};

    var map = new google.maps.Map(document.getElementById('map'), {
        zoom: 3,
        center: myLatLng
    });


    google.maps.event.addListener(map, 'click', function(event) {
        addMarker(event.latLng, map);
        geocodeLatLng(event.latLng,geocoder, map, infowindow);
    });
}



//____________________________________________________________________________________
/*
    добавляем маркер в позицию location
 */
function addMarker(location, map) {
    var marker = new google.maps.Marker({
        position: location,
        label: (number-1).toString(),
        map: map
    });
}

//____________________________________________________________________________________

/*
    очищаем карту и текстовое поле с выбранными городами
    обнуляем номер текущего города
 */
function deleteMarkers() {
    number=0;
    initMap();
    document.getElementById("chosenCities").value='';
}

//____________________________________________________________________________________
/*
    проводим обратное геокодирование
    выводим информацию пользователю о нажатом месте,
    добавляем маркер
    а также добавлем город в поле с выбранными городами
 */
function geocodeLatLng(input,geocoder, map, infowindow) {
    var latlng = {lat: parseFloat(input.lat()), lng: parseFloat(input.lng())};
    geocoder.geocode({'location': latlng}, function(results, status) {
        if (status === 'OK') {
            if (results[1]) {
                var marker = new google.maps.Marker({
                    position: latlng,
                    map: map
                });
                infowindow.setContent(results[1].formatted_address);
                infowindow.open(map, marker);
                addCityToCityField(results[1].address_components);
            } else {
                window.alert('No results found');
            }
        } else {
            window.alert('Geocoder failed due to: ' + status);
        }
    });
}


//____________________________________________________________________________________
/*
       добавляем город в текстовое поле с выбранными городами
 */
function addCityToCityField(address_components) {
    number++;
    var city = getCityFromArray(address_components);
    document.getElementById("chosenCities").value+="\n"+city;
}


//____________________________________________________________________________________
/*
    из массива address_components , который был получен в результате обратного геокодирования,
    извелкаем название страны, области, города или местности
 */
function getCityFromArray(address_components) {
    var strRes=number+". ";

    for (i = 0; i < address_components.length; i++) {
        if (isTypesHaveCountry(address_components[i].types)) {
            strRes += address_components[i].long_name + ', ';
        }
    }
    for(i=0;i<address_components.length;i++){
        if(isTypesHaveAdministrativeAreaLevel1(address_components[i].types)){
            strRes+= address_components[i].long_name+', ';
        }
    }

        for(var i=0;i<address_components.length;i++){
            if(isTypesHaveLocation(address_components[i].types)){
                strRes+= address_components[i].long_name+', ';
            }
        }

    for(i=0;i<address_components.length;i++){
        if(isTypesHaveAdministrativeAreaLevel2(address_components[i].types)){
            strRes+= address_components[i].long_name;
        }
    }

    if(strRes[strRes.length-2]===',')
      strRes =   strRes.substring(0, strRes.length - 2);
    return strRes;
}



//____________________________________________________________________________________
/*
        проверяем есть ли в текущей строке название города
 */
function isTypesHaveLocation(types) {
    for(var i=0;i<types.length;i++){
        if(types[i]==='locality') return true;
    }
    return false;
}

//____________________________________________________________________________________
/*
        проверяем есть ли в текущей строке подробное название местности
 */
function isTypesHaveAdministrativeAreaLevel2(types) {
    for(var i=0;i<types.length;i++){
        if(types[i]==='administrative_area_level_2') return true;
    }
    return false;
}

//____________________________________________________________________________________
/*
        проверяем есть ли в текущей строке название области/округа
 */
function isTypesHaveAdministrativeAreaLevel1(types) {
    for(var i=0;i<types.length;i++){
        if(types[i]==='administrative_area_level_1') return true;
    }
    return false;
}

//____________________________________________________________________________________
/*
        проверяем есть ли в текущей строке название страны
 */
function isTypesHaveCountry(types) {
        for(var i=0;i<types.length;i++){
            if(types[i]==='country') return true;
        }
        return false;
}