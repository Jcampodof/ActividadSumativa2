<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carrito de Compra</title>
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
					<table class="table">
						<thead>
							<tr>
								<th>Nombre</th>
								<th>Descripción</th>
								<th>Precio</th>
								<th>Eliminar</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var = "carrito" items="${listaCarrito}">
							<tr>
								<td><c:out value="${carrito.name}"></c:out></td>
								<td><c:out value="${carrito.description}"></c:out></td>
								<td><c:out value="${carrito.price}"></c:out></td>
								<td><a href="/carrito/eliminar/${carrito.id}">Eliminar</a></td>
							</tr>
							</c:forEach>
						</tbody>	
					</table>
					<hr>
					<table class="table">
						<thead>
							<tr>
								<th></th>
								<th></th>
								<th>Total</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:set var="total" value="${0}"/>
							<c:forEach var="carrito" items="${listaCarrito}">
								<c:set var="total" value="${total + carrito.price}" />
							</c:forEach>		
							<tr>
								<td></td>
								<td></td>
								<td> ${ total}</td>
								<td></td>
							</tr>
						</tbody>
						
						
					<form method="POST" action="/carrito/vaciar" role="form">
					<button id="vaciar" type="submit" class="btn btn-info btn-block">Vaciar Carrito</button>
					</form>
				</div>
			</div>
		</div>
</div>



</body>
</html>