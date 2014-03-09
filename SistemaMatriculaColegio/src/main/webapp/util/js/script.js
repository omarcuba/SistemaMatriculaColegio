window.onload = function() {
	startTime();
	//muestra();
	visitas();
	//fechaSimple();
	fechaFormat();
	hora();
};

function muestra() {
	alert("Ventana emergente");
}

function visitas() {
	var randon = Math.round(Math.random() * 5000);
	var respt = "Numero Visitas: " + randon;
	document.getElementById('visita').value = respt;
}

function fechaSimple() {
	var date = new Date();
	var m = date.getMonth() + 1;
	var mes = (m < 10) ? '0' + m : m;
	var anho = date.getDate();
	var respt = date.getDate() + '/' + mes + '/' + anho;
	document.getElementById('fechaSimple').value = respt;
}

function fechaFormat() {
	var date = new Date();
	var d = date.getDate();
	var dia = (d < 10) ? '0' + d : d;
	var m = date.getMonth() + 1;
	var mes = (m < 10) ? '0' + m : m;
	var a = date.getYear();
	var anho = (a < 1000) ? a + 1900 : a;
	var respt = dia + "/" + mes + "/" + anho;
	document.getElementById('fechaFormat').value = respt;
}

function mesPosicion() {
	for (var i = 0; i < mesPosicion.arguments.length; i++) {
		this[i + 1] = mesPosicion.arguments[i];
	}
}
function fechaNombre() {
	var meses = new mesPosicion('Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo',
			'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
			'Diciembre');
	var date = new Date();
	var dia = date.getDate();
	var mes = date.getMonth() + 1;
	var a = date.getYear();
	var anho = (a < 1000) ? a + 1900 : a;
	var respt = dia + " de " + meses[mes] + " del " + anho;
	document.getElementById('fechaNombre').value = respt;
}
fechaNombre();

function tiempoPosicion(i) {
	if (i < 10) {
		i = "0" + i;
	}
	return i;
}
function startTime() {
	var date = new Date();
	var hora = date.getHours();
	var minuto = tiempoPosicion(date.getMinutes());
	var segundo = tiempoPosicion(date.getSeconds());
	var horario = hora + ":" + minuto + ":" + segundo;
	document.getElementById('reloj').innerHTML = horario;
	t = setTimeout('startTime()', 500);
}

function hora() {
	var DateString = (new Date()).toString();
	self.status = DateString.substring(0, 3 + DateString.lastIndexOf(':'))
			+ "Cualquier mensaje";
	setTimeout("hora()", 200);
}



