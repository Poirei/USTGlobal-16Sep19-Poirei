package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig(); 
		String batchName = config.getInitParameter("batch-name");
		
		String empName = req.getParameter("empname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head><title> Form </title></head>");
		out.println("<body>");
		
		out.println("<h1> Name : ");
		out.println(empName);
		out.println("</h1>");
		out.println("<br>");
		
		out.println("<h1> Email : ");
		out.println(email);
		out.println("</h1>");
		out.println("<br>");
		
		out.println("<h1> Password : ");
		out.println(password);
		out.println("</h1>");
		
		out.println("<h1 style = 'color : green'>");
		out.println(companyName);
		out.println("</h1>");
		
		out.println("<h1 style = 'color : green'>");
		out.println(batchName);
		out.println("</h1>");
		
		out.println("</body>");
		out.println("</html>");
		
	}// end of doGet()
	
}//end of FormServlet
