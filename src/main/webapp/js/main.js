angular.module("ripandoBaseConhecimento", ["ngRoute"])
.config(function($routeProvider, $locationProvider) {
    $routeProvider.when("/principal", {
        templateUrl: "partials/principal.html",
        controller: "MainController"
    });
    
    $routeProvider.otherwise({redirectTo: "/principal"});
});
