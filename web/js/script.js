var app = angular.module("app", []);

app.controller("PruebaController", ['$scope', '$q', '$timeout', function ($scope, $q, $timeout) {

        $scope.mensaje = "Esperando a que se resuelva la promesa"

        function sumaAsincrona(a, b) {
            var defered = $q.defer();
            var promise = defered.promise;


            $timeout(function () {
                defered.notify(0);
            }, 1);
            $timeout(function () {
                defered.notify(33);
            }, 1000);
            $timeout(function () {
                defered.notify(66);
            }, 2000);

            $timeout(function () {
                try {
                    var resultado = a + b;
                    defered.notify(100);
                    defered.resolve(resultado);
                } catch (e) {
                    defered.reject(e);
                }
            }, 3000);
            return promise;
        }

        var promise = sumaAsincrona(5, 2);

        promise.then(function (resultado) {
            $scope.mensaje = "El resultado de la promesa es:" + resultado;
        }, function (error) {
            $scope.mensaje = "Se ha producido un error al obtener el dato:" + error;
        }, function (progreso) {
            $scope.progreso = progreso + "%";
        });

    }]);