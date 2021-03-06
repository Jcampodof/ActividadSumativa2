<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Categoria</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="/">Logout</a>
  	<a class="navbar-brand" href="/usuario" >Registrar Usuario</a>
	<a class="navbar-brand" href="/productos" >Productos</a>
	<a class="navbar-brand" href="/categoria" >Categor?a</a>
	<a class="navbar-brand" href="/carrito" >Carro de Compras</a>
</nav>

<div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="/categoria/insertar">
						<div class="form-group">
							<h2>Agregar Categoria</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="nombre">Nombre:</label>
							<input id="nombre" name="nombre" type="text" maxlength="50" class="form-control">
						</div>		
						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info btn-block">Agregar Categor?a</button>
						</div>
						<hr>
					</form>

				</div>
			</div>
		</div>
</div>

<div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<table class="table">
						<thead>
							<tr>
								<th>Nombre</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var = "categoria" items="${listaCategorias}">
							<tr>
								<td><c:out value="${categoria.nombre}"></c:out></td>
							</tr>
							</c:forEach>
						</tbody>
						
						
					</table>
				</div>
			</div>
		</div>
</div>


</body>
</html>