angular.module("ripandoBaseConhecimento").controller("ArtistasController", function($scope, $http) {
    $scope.artistas = [];

    var promise = $http.get("rest/artistas");
    promise.then(function(retorno) {
        $scope.artistas = retorno.data;
    })
    .catch(function(erro) {
        console.log(erro);
    });

    $scope.adicionar = function() {
        console.log("Novo Artista clicado!");
    }

    $scope.editar = function(id) {
        console.log("Editar clicado. Id: " + id);
    }

    $scope.excluir = function(id) {
        var promise = $http.delete("rest/artistas/" + id);
        promise.then(function() {
            /* precisa mostrar uma mensagem de sucesso na página */
            console.log("Artista excluído com sucesso!");
        })
        .catch(function(erro) {
            console.log(erro);
        });
    }

});
