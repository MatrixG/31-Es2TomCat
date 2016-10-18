package it.boa.alex;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.HttpContext;

@SuppressWarnings("unused")
@WebServlet(description = "esempio", urlPatterns = { "/ServletAddr" })
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		
		
		String pass = request.getParameter("password");
		
		if (pass.equals("123")){
			RequestDispatcher reqDisp = request.getRequestDispatcher("Servlet2");
			reqDisp.forward(request, response);
		}
		else{
			RequestDispatcher reqDisp = request.getRequestDispatcher("login.html");
			PrintWriter pr = response.getWriter();
			pr.println("Username o password errate!");
			reqDisp.include(request, response);
			//response.sendRedirect("login.html");
		}
	}
}
