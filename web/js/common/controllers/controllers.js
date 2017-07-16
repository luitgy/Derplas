var app = angular.module("app", ['ngRoute']);

app.config(['$routeProvider',function($routeProvider) {
 
   $routeProvider.when('/', {
    templateUrl: "pages/login/login.html",
    controller: "LoginController"
  });
 
  $routeProvider.when('/login', {
    templateUrl: "pages/login/login.html",
    controller: "LoginController"
  });
   
  $routeProvider.when('/error', {
    templateUrl: "pages/error/error.html",
    controller: "ErrorController"
  });
   
  $routeProvider.otherwise({
        redirectTo: '/error'
  });   
 
}]);
