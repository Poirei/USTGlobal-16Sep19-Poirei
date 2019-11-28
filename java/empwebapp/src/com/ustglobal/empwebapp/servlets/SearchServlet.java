package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDAOManager;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		} else {
			int id = Integer.parseInt(req.getParameter("id"));
			EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
			EmployeeInfo info = dao.searchEmployee(id);
			
			req.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);
			/*
			 * PrintWriter out = resp.getWriter();
			 * 
			 * if (info != null) { out.println("<html>"); out.
			 * println("<a href = './home' style = 'font-weight : bold; font-size : 20px'> Home </a>"
			 * ); out.
			 * println("<a href = './logout' style = 'float : right; font-weight : bold; font-size : 20px'> Logout </a>"
			 * ); out.println("<table align = 'center'>");
			 * 
			 * out.println("<thead>"); out.println("<tr>"); out.println("<th> ID </th>");
			 * out.println("<th> Name </th>"); out.println("<th> Email </th>");
			 * out.println("</tr>"); out.println("</thead>");
			 * 
			 * out.println("<tbody>"); out.println("<tr>"); out.println("<td>" +
			 * info.getId() + "</td>"); out.println("<td>" + info.getName() + "</td>");
			 * out.println("<td>" + info.getEmail() + "</td>"); out.println("</tr>");
			 * out.println("</tbody>");
			 * 
			 * out.println("</table>"); out.println("</html>"); } else {
			 * out.println("<html>"); out.println("<h1> No such ID exists ! </h1>");
			 * out.println("</html>"); }
			 */
		}
	}
	
}
