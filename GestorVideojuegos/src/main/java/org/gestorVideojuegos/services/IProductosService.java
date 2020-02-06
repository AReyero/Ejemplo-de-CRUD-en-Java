package org.gestorVideojuegos.services;

import org.gestorVideojuegos.entities.ProductosEntity;
import org.gestorVideojuegos.pojos.FiltroProductosPojo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductosService {

	public Page<ProductosEntity> leerTodo(FiltroProductosPojo filtro,Pageable pagina) throws Exception;
	public ProductosEntity leer(Long id) throws Exception;
	public void guardar (ProductosEntity entidad);	
	public void borrar(Long id) ;
	
}
	