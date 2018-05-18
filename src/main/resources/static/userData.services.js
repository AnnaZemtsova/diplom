(function () {
    'use strict';

    angular.module('userData.services', ['ngResource']);

    angular.module('userData.services')
        .factory('wayFinder', wayFinder);


    wayFinder.$inject = ['$resource'];
    function wayFinder($resource) {
        return $resource('../findWay/:path/:cities/:money/:currency/:time/:dayFrom/:monthFrom/:yearFrom/:dayTo/:monthTo/:yearTo',{}, {
            'getWay' :{method:'POST',params:{path:'getAllData',cities: '@cities', money:'@money',currency:'@currency',time:'@time',
                                                        dayFrom:'@dayFrom',monthFrom:'@monthFrom',yearFrom:'@yearFrom',
                                                        dayTo:'@dayTo',monthTo:'@monthTo',yearTo:'@yearTo'}}
                });
    }
})();