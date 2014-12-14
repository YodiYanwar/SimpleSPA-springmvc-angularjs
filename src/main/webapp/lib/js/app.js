var  bismillah = angular.module("bismillah", ["ngRoute"]);
// configure our routes
bismillah.config(function($routeProvider) {
	$routeProvider

	.when('/view1', {
		templateUrl : 'pages/view/view1.html',
		
	})
	.when('/view2', {
		templateUrl : 'pages/view/view2.html',

	})
});