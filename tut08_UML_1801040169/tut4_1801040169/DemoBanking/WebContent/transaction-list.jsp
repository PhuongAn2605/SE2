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
		<h3 class="text-center">TRANSACTION LIST</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Transaction Id</th>
					<th>From Account Number</th>
					<th>To Account Number</th>
					<th>Amount</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach => basic iteration tag --%>
				<c:forEach var="transaction" items="${listTransaction}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${transaction.transactionId}" /></td>
						<td><c:out value="${transaction.fromAccountNumber}" /></td>
						<td><c:out value="${transaction.toAccountNumber}" /></td>
						<td><c:out value="${transaction.amount}" /></td>
						
					
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
