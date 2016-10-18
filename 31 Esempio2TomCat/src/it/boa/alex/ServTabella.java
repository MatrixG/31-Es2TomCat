package it.boa.alex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServTabellaAddr")
public class ServTabella extends HttpServlet {
	private static final long serialVersionUID = 1L;    
   
    public ServTabella() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String out = "<table> " +
						"<thead> " + 
							"<tr> " +
								"<th> a </th> " +
								"<th> b </th> " +
							"</tr> " +
						"</thead> " +
						"<tr> " +
							"<td> 1 </td> " +
							"<td> 2 </td> " +
						"</tr> " +
						"<tr> " +
							"<td> 3 </td> " +
							"<td> 4 </td> " +
						"</tr> " +
					"</table>";
		
		PrintWriter pr = response.getWriter();
		pr.print(out);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}
}
