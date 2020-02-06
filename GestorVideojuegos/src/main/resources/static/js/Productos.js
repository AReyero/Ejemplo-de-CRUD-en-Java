var funciones={
		
		inicio : function(){
			$('#tablaProductos').bootstrapTable({
				url: '/Productos/LeerAll',
				sidePagination: 'server',
				pageSize: 5,
				pagination:true,	
				queryParams: function(params){
					return {
							sort:params.sort,
							order:params.order,
							offset:params.offset,
							limit:params.limit,
						idFiltro: $('#idFiltro').val(),

							nombreFiltro: $('#nombreFiltro').val(),

							seccionFiltro: $('#seccionFiltro').val(),

							proveedorFiltro: $('#proveedorFiltro').val(),

							stockFiltro: $('#stockFiltro').val(),

							precioFiltro: $('#precioFiltro').val(),

							fechaFiltro: $('#fechaFiltro').val(),

						}
				}
			});
		},
		abrirForm : function(data){
				bootbox.dialog({
				title:"Formulario",
				message: "<form id='form'>" +$('#divFormulario').html()+ "</form>",
				buttons:{
					b1:{
						label:"Guardar",
						className:"btn-primary",
						callback: function(){
							funciones.guardar();
						}
					},
					b2:{
						label:"Cerrar",
						className:"btn-secundary",
					}
				}
			});
				if (data!=null){
					$('#form').deserialize(data);
				}
		},
		guardar : function(){
			$.post({
				url:"/Productos/Guardar",
				data: $('#form').serialize(),
				success: function(json){
					if(json.error!=null){
						bootbox.alert(json.error)
					}
					$('#tablaProductos').bootstrapTable('refresh')
				},
				error : function(){
					bootbox.alert("No hay conexion con servidor");
				}
			})
		},
		borrar: function(id){
			$.getJSON({
				url:"/Productos/BorrarID",
				data:{
					id : id
				},
				success: function(json){
					if(json.error!=null){
						bootbox.alert(json.error)
					}
					$('#tablaProductos').bootstrapTable('refresh')
				},
				error : function(){
					bootbox.alert("No hay conexion con servidor");
				}
			})
		},
		editar : function(id){
			$.getJSON({
				url:"/Productos/LeerID",
				data:{
					id : id
				},
				success: function(json){
					if(json.error!=null){
						bootbox.alert(json.error)
					}
					if(json.data!=null){
						funciones.abrirForm(json.data);
					}
				},
				error : function(){
					bootbox.alert("No hay conexion con servidor");
				}
			})
		},
		formatear:function(value,row, index){
			return "<input type='button' onclick='funciones.confirmar("+ row.id +")' class='btn btn-danger' value='Borrar'/>" +
			      "<input type='button' onclick='funciones.editar("+ row.id +")' class='btn btn-success' value='Editar'/>";
		},
		confirmar: function(id){
			swal({
				  title: "Estas seguro de querer borrarlo?",
				  text: "No podras recuperar los datos!",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonClass: "btn-danger",
				  confirmButtonText: "Si, dale duro!",
				  cancelButtonText: "No, cancela!",
				  closeOnConfirm: false,
				  closeOnCancel: false
				},
				function(isConfirm) {
				  if (isConfirm) {
				    swal("Borrado!", "Tus registros has sido borrados", "success");
				    funciones.borrar(id);
				    return true;
				  } else {
				    swal("Cancelado", "casi, casi... :)", "error");
				    return false;
				  }
				});
		}
}


			


$(document).ready(function(){
	funciones.inicio();
	$("#btnInsert").on("click", function(){
		funciones.abrirForm();
	});
$("#btnBuscar").on("click", function() { $("#tablaProductos").bootstrapTable("refresh");})
$("#btnBusquedaAvanzada").on("click", function(){ $("#Avanzada").toggle	(); })
});