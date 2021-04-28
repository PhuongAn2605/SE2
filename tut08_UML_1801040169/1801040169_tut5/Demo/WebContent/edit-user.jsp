<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: Include navigation bar (nav-bar.jsp)  --%>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<%-- TO-DO: CREATE A FORM FOR UPDATING USER --%>
	<div class="container">
			<form action="update" method="post">
			<h3 class="text-center">EDIT USER</h3>
		  <div class="row">
		  	<div class="form-group col-md-7">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="${name}">
          </div>
          <div class="form-group col-md-7">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address" value="${address}">
          </div>
          <div class="form-group col-md-7">
            <label for="mobile">Mobile</label>
            <input type="text" class="form-control" id="mobile" name="mobile" value="${mobile}">
          </div>
          </div>
          <div class="row text-center">
          	<button type="submit" class="btn btn-success">Save</button>
          
		  </div>
		</form>
	</div>
</body>
</html>
