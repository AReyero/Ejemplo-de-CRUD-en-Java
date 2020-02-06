<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos</title>
<%@ include file="includes/IncludeHead.jsp" %>
</head>
<body>
	<%@ include file="includes/IncludeBody.jsp" %>
	<div class="container">
		<h3>Productos</h3>
		
		<input id="btnInsert" type="button" class="btn btn-primary" value="nuevo"/>
		<input id="btnBusquedaAvanzada" type="button" class="btn btn-primary" value="Busqueda Avanzada"/>
		<div id="Avanzada" style="display: none">
		<div class="form-group">
			<input id="nombreFiltro" name="nombreFiltro" class="form-control" placeholder="Introduce nombre"/>
		</div>
		<div class="form-group">
			<input id="seccionFiltro" name="seccionFiltro" class="form-control" placeholder="Introduce seccion"/>
		</div>
		<div class="form-group">
			<input id="proveedorFiltro" name="proveedorFiltro" class="form-control" placeholder="Introduce proveedor"/>
		</div>
		<div class="form-group">
			<input id="stockFiltro"  type="number" name="stockFiltro" class="form-control" placeholder="Introduce stock"/>
		</div>
		<div class="form-group">
			<input id="precioFiltro"  type="number" name="precioFiltro" class="form-control" placeholder="Introduce precio"/>
		</div>		
		<div class="form-group">
			<input id="fechaFiltro" type="date" name="fechaFiltro" class="form-control" placeholder="Introduce fecha"/>
		</div>
		<input id="btnBuscar" type="button" class="btn btn-primary" value="buscar"/>
		</div>
		<table id="tablaProductos">
			<thead>
				<tr>
					<th data-formatter="funciones.formatear"></th>
					<th data-field="id" data-sortable="true">id</th>
					<th data-field="nombre" data-sortable="true">nombre</th>
					<th data-field="seccion" data-sortable="true">seccion</th>
					<th data-field="proveedor" data-sortable="true">proveedor</th>
					<th data-field="stock" data-sortable="true">stock</th>
					<th data-field="precio" data-sortable="true">precio</th>
					<th data-field="fecha" data-sortable="true">fecha</th>
				</tr>
			</thead>
		</table>
	</div>

	<div id="divFormulario" style="display:none">
<!-- 		<div class="form-group"> -->
<!-- 			<label for="description">Descripcion</label> -->
<!-- 			<input id="description" name="description" class="form-control"/> -->
<!-- 		</div>	 -->
<!--		Como hacer select -->
<!--		<select id="id" name="id" class="form-control"> -->
<!--			<option value="valor">valor</option> -->
<!--			<option value="valor">valor</option> -->
<!--		</select>-->
<!--		como hacer text Area-->
<!--<textarea id="id" name="id" class="form-control rounded-0" rows="3"></textarea> -->

		<input name="${ _crsf.parameterName}" value="${ _crsf.token}" type="hidden" />

		<input id="id" name="id" type="hidden"/>
		<div class="form-group">
			<input id="nombre" name="nombre" class="form-control" placeholder="Introduce nombre"/>
		</div>
		<div class="form-group">
			<input id="seccion" name="seccion" class="form-control" placeholder="Introduce seccion"/>
		</div>
		<div class="form-group">
			<input id="proveedor" name="proveedor" class="form-control" placeholder="Introduce proveedor"/>
		</div>
		<div class="form-group">
			<input id="stock"  type="number" name="stock" class="form-control" placeholder="Introduce stock"/>
		</div>
		<div class="form-group">
			<input id="precio"  type="number" name="precio" class="form-control" placeholder="Introduce precio"/>
		</div>
		<div class="form-group">
			<input id="fecha" type="date" name="fecha" class="form-control" placeholder="Introduce fecha"/>
		</div>
	</div>	
<%@ include file="includes/IncludeFoot.jsp" %>
<script src="/js/Productos.js"></script>
</body>

</html>