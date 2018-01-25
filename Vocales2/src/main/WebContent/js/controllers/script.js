var app = angular.module("app", []);
app.controller("PruebaController", function($scope, $interval) {

	$scope.esferas = [ {
		"id" : "#A",
		"name" : "caja1",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/A1.jpg"
	}, {
		"id" : "#B",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/B1.jpg"
	}, {
		"id" : "#C",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/C1.jpg"
	}, {
		"id" : "#D",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/D1.jpg"
	}, {
		"id" : "#E",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/E1.jpg"
	}, {
		"id" : "#F",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/F1.jpg"
	}, {
		"id" : "#G",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/G1.jpg"
	}, {
		"id" : "#H",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/H1.jpg"
	}, {
		"id" : "#I",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/I1.jpg"
	},

	{
		"id" : "#J",
		"name" : "caja1",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/J1.jpg"
	}, {
		"id" : "#K",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/K1.jpg"
	}, {
		"id" : "#L",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/L1.jpg"
	}, {
		"id" : "#M",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/M1.jpg"
	}, {
		"id" : "#N",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/N1.jpg"
	}, {
		"id" : "#ENIE1",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/ENIE1.jpg"
	}, {
		"id" : "#O",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/O1.jpg"
	}, {
		"id" : "#P",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/P1.jpg"
	}, {
		"id" : "#Q",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/Q1.jpg"
	},

	{
		"id" : "#R",
		"name" : "caja1",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/R1.jpg"
	}, {
		"id" : "#S",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/S1.jpg"
	}, {
		"id" : "#T",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/T1.jpg"
	}, {
		"id" : "#U",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/U1.jpg"
	}, {
		"id" : "#V",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/V1.jpg"
	}, {
		"id" : "#X",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/X1.jpg"
	}, {
		"id" : "#Y",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/Y1.jpg"
	}, {
		"id" : "#Z",
		"name" : "caja2",
		"class" : "cuadro",
		"srcImg" : "imgs/letras/Z1.jpg"
	} ];

	$scope.mensaje = "Hola Mundo";
	$scope.maxX = 800;
	$scope.maxY = 800;
	$scope.counter = 1;
	$scope.counter = 1;
	var avanza = 1;

	increaseCounter = function() {
		$scope.counter = $scope.counter + 1;
		console.log($scope.counter);
	};
	moveImges = function() {

		console.log(element.id);
		avanza = avanza + 1;
		avanzarX(element, avanza);
		avanzarY(element, avanza);
		console.log(element.style.left);
		console.log(element.style.top);
	};
	avanzarX = function(elementToMove, x) {
		var elM = elementToMove;
		elM.style.left = x + "px";
	};
	avanzarY = function(elementToMove, y) {
		var elM = elementToMove;
		elM.style.top = y + "px";
	};
	starMove = function() {
		var element = document.getElementById("#A");
		$interval(moveImges, 10);

	};

});