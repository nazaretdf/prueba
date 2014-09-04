package es.insa.curso.web;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;




// ESTO VA A SER UN SERVICIO REST CREADO CON JAX-RS
// PERO JAX-RS DE POR SÍ ES SÓLO UNA INTERFAZ
// JERSEY ES UNA VERSIÓN DE JAX-RS
// PERO   SE CONFIGURA CON ANOTACIONES

@Path("/") 
public class ServicioREST {
	public ServicioREST() {
		
	}
	// cuando lo hace en formato GET	
	@GET
	// http:localhost:8080/web-ejemplo/WebContent/saludar
	@Path("/saludar")
	
	// todo esto se hace en un Servlet 
	// @QueryParam es cuando queremos parametros de la URL ?nombre=
	public String saludar(@QueryParam("nombre") String nombre){
		return "Hola " + nombre;
	}
	
	@POST
	// esto se tendría que hacer con formulario o AJAX
	@Path("/adios/{nombre}")
	// para enviar los parámetros
	public String despedirse (@PathParam("nombre") String nombre){
		return "Adios " + nombre;
	}

}
