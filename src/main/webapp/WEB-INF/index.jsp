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
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="/productos" role="form">
						<div class="form-group">
							<h2>Create account</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="nombre">Nombre:</label>
							<input id="nombre" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="pass">Password</label>
							<input id="pass" type="password" maxlength="25" class="form-control" placeholder="at least 6 characters" length="40">
						</div>
						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info btn-block">Iniciar Sesión</button>
						</div>
						<hr>
					</form>
					<form method="POST" action="/usuario" role="form">
					<div class="form-group">
							<button id="Submit" type="submit" class="btn btn-info btn-block" >Registarse</button>
					</div>
					</form>
						<hr>
				</div>
			</div>
		</div>
	</div>

</body>
</html>