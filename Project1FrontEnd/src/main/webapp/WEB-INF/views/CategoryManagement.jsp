
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Category Management</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="${css}/mycss.css" rel='stylesheet' type='text/css' />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<div class="panel">
			<div class="panel-heading">

				<h3>
					<center>Category Management</center>
				</h3>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" action="">
					<div class="form-group">
						<label class="control-label col-md-2" for="catid">CategoryID</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="catid">
						</div>
					</div>
					<div class="form-group" id="abc">
						<label class="control-label col-sm-2" for="name">Name</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name">
						</div>
					</div>
					<div class="form-group" id="abc">
						<label class="control-label col-sm-2" for="desc">Description</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="desc">
						</div>
					</div>

					<div class="form-group" id="abc">
						<label class="control-label col-sm-2" for="active">Active?</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="active">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
				</form>


			</div>

</body>
</html>