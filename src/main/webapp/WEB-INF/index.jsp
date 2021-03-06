<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
    <div class="container">
		<div class="row">
			<div class="panel panel-primary col-lg-10">
				<div class="panel-body centering">
					<form method="POST" action="/login/login" role="form" class="col-lg-10">
						<div class="form-group">
							<h2>Login Tienda Virtual</h2>
						</div>
						<div class="form-group ">
							<label class="control-label" for="email">Email:</label>
							<input id="email" type="email" name=email class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="pass">Password</label>
							<input id="pass" name=pass type="password" class="form-control" placeholder=" ">
						</div>
						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info col-lg-2" style="padding: 10px">Iniciar Sesi?n</button>
							<a href="/login" class="btn btn-info col-lg-2" style="padding: 10px; margin-left: 10px">Registarse</a>
						</div>
					
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>