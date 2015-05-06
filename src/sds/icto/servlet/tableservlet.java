package sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tableservlet
 */
@WebServlet("/tableservlet")
public class tableservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tableservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<table border='1px' cellspacing = '0px' cellpadding='10px'>");
		out.println("<tr>");
		out.println("<td>셀(0,0)</td>");
		out.println("<td>셀(0,1)</td>");
		out.println("<td>셀(0,2)</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>cell(1,0)</td>");
		out.println("<td>cell(1,1)</td>");
		out.println("<td>cell(1,2)</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>cell(2,0)</td>");
		out.println("<td>cell(2,1)</td>");
		out.println("<td>cell(2,2)</td>");
		out.println("</tr>");
		out.println("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
