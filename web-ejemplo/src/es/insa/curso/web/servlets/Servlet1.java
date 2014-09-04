package es.insa.curso.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1º EXTRAER LOS DATOS DE ENTRADA DE REQUEST
			// a este servlet le habia puesto alisas-- calculadora
			// los datos siempre vienen en formato de texto por lo que hay que convertirlos
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String ope = request.getParameter("op");
		
		//2º CONVERTIR LOS DATOS
			// hay que comprobar que los datos que me envian son correctos,por 
			// ejeplo que no venga una letra
		double x = Double.valueOf(op1);
		double y = Double.valueOf(op2);
		
		//3º DELEGAR LA EJECUCION CONCRETA QUE TOQUE
		double resultado = calcular(x,y,ope);
		
		//4º DEVOLVER LOS RESULTADOS AL USUARIO
			// a) A LO BRUTO: COMO EL SYSO PERO EN WEB
			response.getWriter().print("El resultado es " + resultado);
			// b) MEDIANTE UNA PAGINA WEB
			request.setAttribute("r", resultado);
			
			request.getRequestDispatcher("pagina.jsp")
				.forward(request, response);
			
		// EL CODIGO QUE PONGA YO AQUÏ NO SIRVE PARA NADA, porq ya se ha ido :P
			
		
		
	}

	private double calcular(double x, double y, String ope) {
		if("sumar".equals(ope)){
			return x+y;
		}else if("restar".equals(ope)){
			return x-y;
		}else if("multiplicar".equals(ope)){
			return x*y;
		}else if("dividir".equals(ope)){
			return x/y;
		}else {
			return Double.NaN;
		}
	}

}
