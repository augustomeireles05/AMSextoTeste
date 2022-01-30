package br.com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TerceiroServlet
 */
@WebServlet("/TerceiroServlet")
public class TerceiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Calcular c;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TerceiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		process3(request, response);
							
	}
	
	private void process3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if ( (request.getParameter("val1") != null) && (request.getParameter("val2") != null) ) {
			
			//Realiza a Leitura dos parâmetros:
			int val1 = Integer.parseInt(request.getParameter("val1"));
			int val2 = Integer.parseInt(request.getParameter("val2"));
			
			Calcular c = new Calcular(val1, val2);
			
			//INSERINDO APENAS O SOMAR
			
				//int resultado = c.somar(); // atribui a variável resultado ao valor de retorno do método somar.
				
				//Capturando o resultado da Model, i.e., da Classe Calcular
				//request.setAttribute("resposta", resultado); // Requisitando ao Scopo, utilizando o Forward.
				
			
			
			//INSERINDO TODA A LÓGICA CONSTRUÍDA PARA A CALCULADORA COMPLETA.
			
				if (request.getParameter("btnSomar") != null) {
					int resultado = c.somar();
					request.setAttribute("resposta", resultado);
				} else if (request.getParameter("btnSubtrair") != null) {
					int resultado = c.subtrair();
					request.setAttribute("resposta", resultado);
				} else if (request.getParameter("btnMultiplicar") != null) {
					int resultado = c.multiplicar();
					request.setAttribute("resposta", resultado);
				} else if (request.getParameter("btnDividir") != null) {
					int resultado = c.dividir();
					request.setAttribute("resposta", resultado);
				}
	
		}
		
		//Trazendo o resultado da captura realizada acima e imprimindo no FRONT, i.e., na VIEW. 
		request.getRequestDispatcher("/index.jsp").forward(request, response); //Redirecionando a captura do valor para a mesma página do front.
		
	}

}
