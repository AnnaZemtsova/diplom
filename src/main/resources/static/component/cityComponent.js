(function () {
    'use strict';
    angular.module('userData')
        .component('cityComponent', {
            templateUrl: '../component/cityComponent.html',
            controller: cityController,
            controllerAs: 'city',
            bindings: {
                cityData: '<',
                onDelete: '&'
            }
        });

    function cityController() {

        this.deleteCity = function () {
            console.log("it's works");
            this.onDelete(cityData);
        }

    }
})();