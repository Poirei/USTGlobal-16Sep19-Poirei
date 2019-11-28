<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
<title>Search</title>
</head>

<%
	EmployeeInfo info = (EmployeeInfo) request.getAttribute("info");
%>

<body>
	<a href='./home.jsp' style='font-weight: bold; font-size: 20px'>
		Home </a>
	<a href='./logout'
		style='float: right; font-weight: bold; font-size: 20px'> Logout </a>
	<%
		if (info != null) {
	%>
	<div class="mdc-data-table">
		<table class="mdc-data-table__table" aria-label="Dessert calories">
			<thead>
				<tr class="mdc-data-table__header-row" style="background-color : #26A69A">
					<th class="mdc-data-table__header-cell" role="columnheader"
						scope="col">ID</th>
					<th
						class="mdc-data-table__header-cell mdc-data-table__header-cell--numeric"
						role="columnheader" scope="col">Name</th>
					<th
						class="mdc-data-table__header-cell mdc-data-table__header-cell--numeric"
						role="columnheader" scope="col">Email</th>
				</tr>
			</thead>
			<tbody class="mdc-data-table__content">
				<tr class="mdc-data-table__row">
					<td class="mdc-data-table__cell"><%=info.getId() %></td>
					<td class="mdc-data-table__cell mdc-data-table__cell--numeric"><%=info.getName() %></td>
					<td class="mdc-data-table__cell mdc-data-table__cell--numeric"><%=info.getEmail() %></td>
				</tr>
			</tbody>
		</table>
	</div>
	<%
		} else {
	%>
	<h1>No data found!!</h1>
	<%
		}
	%>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
</body>
</html>