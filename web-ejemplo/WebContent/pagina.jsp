<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Un ejemplo de JSP para la calculadora</title>
		
	</head>
	<body>
		<h1>Formulario</h1>
		<p>Introduce los datos y pulsa una operación</p>
		<table>
			<!--  fila -->
			<tr>
				<!-- casilla dentro de una fila(columna) -->
				<td>
					<!-- a donde voy a enciar los datos (como llamé al servlet)-->
					<!-- ponemos un punto al principio + nombre del Servelt -->
					<!-- se ve en Servlet Mapping -->
					<form action="./calculadora.html">
						<!-- los input -->
						Indica el operando 1:
						<input name="op1" value="${param.op1}"/> 
						<br/>
						Indica el operando 2:
						<input name="op2" value="${param.op2}"/>
						<br/>
						<br/>
						<br/>
						Indica la operación :					
						
						<!-- Botón submit-->
						<br/>
						<input name="op" value="sumar" type="submit"/>
						<input name="op" value="restar" type="submit"/>
						<input name="op" value="multiplicar" type="submit"/>
						<input name="op" value="dividir" type="submit"/>
						
						<br/>
						<br/>
						<br/>
						O selecciona del menú desplegable:
						<select name="op" >
							<option value="sumar" ${param.op=="sumar" ? "selected" : ""} >Suma</option>
							<option value="restar" ${param.op=="restar" ? "selected" : ""} >Resta</option>
							<option value="multiplicar" ${param.op=="multiplicar" ? "selected" : ""} >Producto</option>
							<option value="dividir" ${param.op=="dividir" ? "selected" : "" } >Cociente</option>
						</select>
						<input type="submit" value="Calcular">
					</form>
				</td>
				<td>
					<img alt="Leo Harlem" src="http://www.mpcmanagement.es/wp-content/uploads/2013/12/correrharm.jpg"
						width="200"/>
				</td>
			</tr>
		</table>
		
		
		<h1>Resultados</h1>
		<p>En esta página se muestra el resultado
		de aplicar una operaciín a través del Servlet de 
		ejemplo que hemos creado</p>
		
		<h2>Datos de entrada</h2>
		
		<p>
			Los datos de entrada son:
			<br/>
			<ul>
				<li>Operando 1: &nbsp; ${param.op1}</li>
				<li>Operando 2: &nbsp; ${param.op2 }</li>
				<li>Operación &nbsp;&nbsp; : &nbsp; ${param.op } </li>
			</ul>
		</p>
		
		<h2>Resultados</h2>
		<p>El resultado de la operación es ${r}</p>
	
	</body>
</html>