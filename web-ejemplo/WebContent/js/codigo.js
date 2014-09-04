// ya que el código está separado (en otro fichero fuera del HTML)
// Lo voy a separar todo
// Y voy a poner los eventos desde aquí

function testAjax(){
	ajax = new XMLHttpRequest();
	
	// method, url, async, username, password
	// abro la conexión
	ajax.open(
			"POST", 
			"http://localhost:8080/web-ejemplo/rest/adios/Oliver", 
			true);
	// tengo que preparar la respuesta
	ajax.onreadystatechange = responder;
	// tengo que hacer la petición
	ajax.send();
	
}
function responder(){
	// esta condición es que ha dicho SI que ha terminado y tiene 
	// una respuesta
	if(ajax.readyState == 4 && ajax.status == 200){
		var resultado = ajax.responseText;
		alert(resultado);
	}
}

// me invento una funcón main
function main(){
	// Aquí voy a enlazar todos los eventos
	var boton1 = document.getElementById("probarAJAX");
	boton1.onclick = testAjax;
}
// la función main se va a ejecutar cuando se cargue la página
window.onload = main;