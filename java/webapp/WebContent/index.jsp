<%@ page import = "java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	public void jspInit() {
	System.out.println("This is init phase.");
}

	public void jspDestroy() {
		System.out.println("This is destroy phase.");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
	Date date = new Date();
	m();
%>
<%!
	public int i = 5;
	public void m() {
		System.out.println(i);
	}
%>
<body>

	<h1 style = "color : green"> Date and Time is <%=date%></h1>
</body>
</html>