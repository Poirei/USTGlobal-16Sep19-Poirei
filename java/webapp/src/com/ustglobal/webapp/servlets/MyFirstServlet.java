package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object obj = req.getAttribute("obj");
		
		System.out.println("service method.");
		System.out.println("extra line of method.");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig(); 
		String batchName = config.getInitParameter("batch-name");
		 

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		Date date = new Date();
		out.println("<h1 style = 'color : green'> Date and time is : ");
		out.println(date.toString());
		out.println("</h1>");

		out.println("<h1 style = 'color : green'>");
		out.println(companyName);
		out.println("</h1>");
		
		out.println("<h1 style = 'color : green'>");
		out.println(batchName);
		out.println("</h1>");
		
		out.println("<h1 style = 'color : green'>");
		out.println(obj);
		out.println("</h1>");

		out.println(req.getRequestURI());
		out.println("<br>");
		out.println(req.getMethod());

		out.println("</body>");
		out.println("</html>");
	}// end of doGet()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "aagaya maagyaa....";
	}

}// end of MyFirstServlet
