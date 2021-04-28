<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>;
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
		<h3 class="text-center">USER LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>User Id</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${listUser}">
					<tr>
						<td><c:out value="${user.userId}"></c:out></td>
						<td><c:out value="${user.password}"></c:out></td>
						
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>