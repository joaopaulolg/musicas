angular.module("ripandoBaseConhecimento", ["ngRoute"])
.config(function($routeProvider, $locationProvider) {
    $routeProvider.when("/principal", {
        templateUrl: "partials/principal.html",
        controller: "MainController"
    })
    .when("/artistas", {
        templateUrl: "partials/artistas.html",
        controller: "ArtistasController"
    })
    .when("/estilos", {
        templateUrl: "partials/estilos.html",
        controller: "EstilosController"
    })
    .otherwise({redirectTo: "/principal"});
});
