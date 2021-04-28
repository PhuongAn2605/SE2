<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="index.html" %>
<html>
<head>
<title>Banking Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<br>
		<h3 class="text-center">ACCOUNT LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Account Number</th>
					<th>Name</th>
					<th>Address</th>
					<th>Date of birth</th>
					<th>Phone</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach => basic iteration tag --%>
				<c:forEach var="account" items="${listAccount}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${account.accountNumber}" /></td>
						<td><c:out value="${account.name}" /></td>
						<td><c:out value="${account.address}" /></td>
						<td><c:out value="${account.dob}" /></td>
						<td><c:out value="${account.phone}" /></td>
						<td><c:out value="${account.email}" /></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
