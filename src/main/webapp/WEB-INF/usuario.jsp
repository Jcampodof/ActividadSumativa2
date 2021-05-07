<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Usuario</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="/">Logout</a>
  	<a class="navbar-brand" href="/usuario" >Registrar Usuario</a>
	<a class="navbar-brand" href="/productos" >Productos</a>
	<a class="navbar-brand" href="/categoria" >Categoría</a>
	<a class="navbar-brand" href="/carrito" >Carro de Compras</a>
</nav>
</div>
    <div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="/usuario/insertar">
						<div class="form-group">
							<h2>Crear un Usuario</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="name">Nombre: </label>
							<input id="name" name="name" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="email">Email</label>
							<input id="email" name="email" type="email" maxlength="100" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="password">Password</label>
							<input id="password" name="password" type="password" maxlength="25" class="form-control" placeholder="al menos 6 caracteres" length="40">
						</div>
						<div class="form-group">
							<label class="control-label" for="vip">¿Es VIP?</label>
							<label class="radio-inline"><input type="radio" name="vip" value="1">Si</label>
							<label class="radio-inline"><input type="radio" name="vip" value="0">No</label>

						</div>
						

						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info btn-block">Crear Usuario</button>
						</div>
						<hr>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>