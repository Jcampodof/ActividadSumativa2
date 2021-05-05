<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Producto</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="/productos" >Regresar</a>
</nav>

<div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form:form method="POST" action="/productos/update" modelAttribute="producto">
					<form:hidden path="id"/>
						<div class="form-group">
							<h2>Modificar Producto</h2>
						</div>
						<div class="form-group">
							<form:label class="control-label" path="name">Nombre:</form:label>
							<form:input path="name" class="form-control"/>
						</div>
						<div class="form-group">
							<form:label class="control-label" path="description">Descripción: </form:label>
							<form:input path="description" class="form-control"/>
						</div>
						<div class="form-group">
							<form:label class="control-label" path="price">Precio: </form:label>
							<form:input path="price" class="form-control"/>
						</div>
						<div class="form-group">
						<form:select path="categorias" class="control-label form-control">
							<option value="0"  class="control-label"> Seleccione Categoría...</option>
			 					<c:forEach var="categoria" items="${listaCategorias}">
                                        <option value="<c:out value="${categoria.id}"></c:out>"><c:out value="${categoria.nombre}"></c:out> </option>
                                </c:forEach>
                        </form:select>

						</div>


							<input type="submit" value="Modificar" class="btn btn-info btn-block">

						<hr>
					</form:form>

				</div>
			</div>
		</div>
	</div>

</body>
</html>