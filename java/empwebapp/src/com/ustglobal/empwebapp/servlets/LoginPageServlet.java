package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}

//		out.println("<html>");
//		out.println("<head>\r\n" + 
//				"    <meta charset=\"UTF-8\">\r\n" + 
//				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
//				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
//				"    <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n" + 
//				"    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css\">\r\n" + 
//				"    <title>login</title>\r\n" + 
//				"</head>");
//		out.println("<body>");
//		out.println("<div class=\"row\">\r\n" + 
//				"        <form class=\"col s12\" action=\"./login\" method=\"POST\">\r\n" + 
//				"            <div class=\"row\">\r\n" + 
//				"                <div class=\"input-field col s6\">\r\n" + 
//				"                    <i class=\"material-icons prefix\">account_circle</i>\r\n" + 
//				"                    <input id=\"icon_prefix\" type=\"text\" class=\"validate\" name=\"id\" value='" + id + "'>\r\n" + 
//				"                    <label for=\"icon_prefix\">ID</label>\r\n" + 
//				"                </div>\r\n" + 
//				"                <div class=\"input-field col s6\">\r\n" + 
//				"                    <i class=\"material-icons prefix\">lock</i>\r\n" + 
//				"                    <input id=\"icon_telephone\" type=\"password\" class=\"validate\" name=\"password\">\r\n" + 
//				"                    <label for=\"icon_telephone\">Password</label>\r\n" + 
//				"                </div>\r\n" + 
//				"            </div>\r\n" + 
//				"            <p>\r\n" + 
//				"                <input type=\"checkbox\" id=\"test5\" name=\"remember\" value=\"check\"/>\r\n" + 
//				"                <label for=\"test5\">Remember Me</label>\r\n" + 
//				"            </p>\r\n" + 
//				"            <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"action\">Login\r\n" + 
//				"                <i class=\"material-icons right\">send</i>\r\n" + 
//				"            </button>\r\n" + 
//				"            <a class=\"waves-effect waves-light btn\" href=\"./register.html\">Register</a>\r\n" + 
//				"        </form>\r\n" + 
//				"    </div>\r\n" + 
//				"\r\n" + 
//				"\r\n" + 
//				"    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n" + 
//				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js\"></script>");
//		out.println("</body>");
//		out.println("</html>");
	}//end of doGet()

}//end of LoginPageServlet
