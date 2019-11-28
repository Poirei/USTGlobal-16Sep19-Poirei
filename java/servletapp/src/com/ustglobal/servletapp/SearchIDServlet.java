package com.ustglobal.servletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchIDServlet extends HttpServlet {
	
	String url = "jdbc:mysql://localhost:3306/ust_ty_ust?user=root&password=root";
	int id;
	String name;
	int sal;
	String gender;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String empid = req.getParameter("empid");
		
		
		try (Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement("select * from Employee_Info where id = ?");
				) {
			pstmt.setInt(1, Integer.parseInt(empid));
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				sal = rs.getInt("salary");
				gender = rs.getString("gender");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th> Id </th>");
		out.println("<th> Name </th>");
		out.println("<th> Salary </th>");
		out.println("<th> Gender </th>");
		out.println("</tr>");
		out.println("</thead>");
		
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<td>" + id + "</td>");
		out.println("<td>" + name + "</td>");
		out.println("<td>" + sal + "</td>");
		out.println("<td>" + gender + "</td>");
		out.println("</tr>");
		out.println("</tbody>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	
}
