(function () {
    'use strict';

    angular.module('userData')
        .controller("controller", userDataController);


    userDataController.$inject = ['$scope', 'wayFinder'];

    function userDataController($scope, wayFinder) {
        $scope.cityDatas = [];



        $scope.findWay = function () {
            var cities =$scope.chosenCities;// document.getElementById("chosenCities").value;
            console.log(cities+" CITIES");
            var time =$scope.time; //document.getElementById("time").value;
            var money =$scope.money; //document.getElementById("money").value;
            var dateFrom = new Date($scope.dateFrom);//document.getElementById("dateFrom").value);
            var dateTo = new Date($scope.dateTo);//document.getElementById("dateTo").value);
            var currency = $scope.currency;//document.getElementById("currency").value;

            console.log(time+" "+money+" "+dateTo);
            if(validation(cities,money,time,dateFrom,dateTo,currency)) {
                var dayFrom = dateFrom.getDate();
                var monthFrom = dateFrom.getMonth();
                var yearFrom = dateFrom.getFullYear();

                var dayTo = dateTo.getDate();
                var monthTo = dateTo.getMonth();
                var yearTo = dateTo.getFullYear();

                var way = wayFinder.getWay({money: money,currency:currency,time:time,dayFrom:dayFrom,monthFrom:monthFrom,
                yearFrom:yearFrom,dayTo:dayTo,monthTo:monthTo,yearTo:yearTo});
            }
        };
    }

    function validation(cities,money,time,dateFrom,dateTo,currency) {
        var isFullField = fullField(cities,money,time,dateFrom,dateTo,currency);
        var correctDate = isDateCorrect(dateFrom,dateTo);
        var validData = isValidNumbers(money,time);
        if(!isFullField){
            alert("Заполните все поля!");
            clearField();
            return false;
        }
        if(!validData){
            alert("Количество денег и времени должно быть числом!");
            clearField();
            return false;
        }
        if(!correctDate){
            alert("Дата возвращения должна быть больше даты отправления!");
            clearField();
            return false;
        }
        clearField();
        return true;
    }

    function isDateCorrect(dateFrom,dateTo) {
        var dd = dateFrom.getDate();
        var dc = dateTo.getDate();
        var md = dateFrom.getMonth();
        var mc = dateTo.getMonth();
        var yd = dateFrom.getFullYear();
        var yc = dateTo.getFullYear();

        return (((dd < dc && md <= mc && yd <= yc) ||
            (md < mc && yd <= yc) ||
            (yd < yc)));
    }

    function isValidNumbers(money,time) {
        return !(isNaN(time) || isNaN(money));

    }

    function fullField(cities,money,time,dateFrom,dateTo,currency) {
        return !(cities===''||time === '' || money === '' || dateFrom === '' || dateTo === '' || currency === '');

    }

    function clearField($scope) {
        $scope.dateFrom ="";
        $scope.dateTo = "";
        $scope.currency = "";
        $scope.money = "";
        $scope.time = "";
      /*  document.getElementById("dateFrom").value='';
        document.getElementById("dateTo").value='';
        document.getElementById("money").value='';
        document.getElementById("time").value='';
        document.getElementById("currency").value='';*/
    }
})();