<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome, <%=info.getName() %></h1>
	<a href='./search.html'> Search </a>
	<a href='./changepwd.jsp'> Change Password </a>
	<a href='./logout'> Logout </a>
</body>
</html>