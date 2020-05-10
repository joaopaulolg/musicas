angular.module("ripandoBaseConhecimento").controller("EstilosController", function($scope) {
    $scope.estilos = [
        {
            id: 1,
            nome: "Heavy Metal"
        },
        {
            id: 2,
            nome: "Thrash Metal"
        }
    ];
    /* recuperar todos os estilos via REST */
    /* colocar no $scope */

    $scope.adicionar = function() {
        console.log("Novo Estilo clicado!");
    }

    $scope.editar = function(id) {
        console.log("Editar clicado. Id: " + id);
    }

    $scope.excluir = function(id) {
        console.log("Excluir clicado. Id: " + id);
    }

});
