var app = angular.module("app", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "main.htm",
    })
    .when("/orders", {
        templateUrl : "orders.html",
        controller : "ordersCtrl"
    })
    .when("/billings", {
        templateUrl : "billings.html",
        controller : "billingsCtrl"
    }).when("/budgets", {
        templateUrl : "budgets.html",
        controller : "budgetsCtrl"
    });
});
app.controller("ordersCtrl", function ($scope) {
    $scope.mensaje = "Orders";
});
app.controller("billingsCtrl", function ($scope) {
    $scope.mensaje = "Billings";
});
app.controller("budgetsCtrl", function ($scope) {
    $scope.mensaje = "Budgets";
});