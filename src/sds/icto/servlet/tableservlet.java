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
		
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow;int nCol;
		
		if(row != null){
			
			nRow = Integer.parseInt(row);
		}else{
			nRow = 3;
		}
		
		if(col != null){
			
			nCol= Integer.parseInt(col);
		}else{
			nCol = 3;
		}
		
		out.println("<table border='1px' cellspacing = '0px' cellpadding='10px'>");
		
		for(int i = 0 ; i< nRow; i++){
			out.println("<tr>");
				for(int j = 0; j<nCol; j++){
					out.println("<td>");
					out.println("ceil ("+i+", "+j+")");
					out.println("</td>");
				}
			out.println("</tr>");
		}
		out.println("</table>");
	}
	
	public void destroy(){}

}
