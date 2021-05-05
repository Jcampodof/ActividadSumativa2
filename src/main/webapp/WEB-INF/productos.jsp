<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="/">Home</a>
  	<a class="navbar-brand" href="/usuario" >Registrar Usuario</a>
	<a class="navbar-brand" href="/productos" >Productos</a>
	<a class="navbar-brand" href="/categoria" >Categoría</a>
	<a class="navbar-brand" href="/carrito" >Carro de Compras</a>
</nav>

<div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="/productos/insertar">
						<div class="form-group">
							<h2>Agregar Producto</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="nombre">Nombre:</label>
							<input id="nombre" name="nombre" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="descripcion">Descripción: </label>
							<input id="descripcion" name="descripcion" type="text" maxlength="100" class="form-control" placeholder=" ">
						</div>
						<div class="form-group">
							<label class="control-label" for="precio">Precio: </label>
							<input id="precio" name="precio" type="number" class="form-control" placeholder=" ">
						</div>
						
						
						<div class="form-group">
							<button id="signupSubmit" type="submit" class="btn btn-info btn-block">Agregar Producto</button>
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
								<th>Descripción</th>
								<th>Precio</th>
								<th>Agregar a Carrito</th>
								<th>Modificar</th>
								<th>Eliminar</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var = "producto" items="${listaProductos}">
							<tr>
								<td><c:out value="${producto.name}"></c:out></td>
								<td><c:out value="${producto.description}"></c:out></td>
								<td><c:out value="${producto.price}"></c:out></td>
								<td><a href="/carrito/insertar/${producto.id}/${producto.name}/${producto.description}/${producto.price}">Agregar al Carrito</a></td>
								<td><a href="/productos/editar/${producto.id}">Editar</a></td>
								<td><a href="/productos/eliminar/${producto.id}">Eliminar</a></td>
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