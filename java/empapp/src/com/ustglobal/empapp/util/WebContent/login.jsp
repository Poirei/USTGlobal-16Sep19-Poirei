<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
<title>login</title>
</head>
<%
String id = "";
Cookie[] cookies = request.getCookies();

if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
%>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<body>
	<h4><%=msg %></h4>
	<div class="row">
		<form class="col s12" action="./login" method="POST">
			<div class="row">
				<div class="input-field col s6">
					<i class="material-icons prefix">account_circle</i> <input
						id="icon_prefix" type="text" class="validate" name="id" value="<%=id%>"> <label
						for="icon_prefix">ID</label>
				</div>
				<div class="input-field col s6">
					<i class="material-icons prefix">lock</i> <input
						id="icon_telephone" type="password" class="validate"
						name="password"> <label for="icon_telephone">Password</label>
				</div>
			</div>
			<p>
				<input type="checkbox" id="test5" name="remember" value="check" />
				<label for="test5">Remember Me</label>
			</p>
			<button class="btn waves-effect waves-light" type="submit"
				name="action">
				Login <i class="material-icons right">send</i>
			</button>
			<a class="waves-effect waves-light btn" href="./register.html">Register</a>
		</form>
	</div>


	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
</body>

</html>