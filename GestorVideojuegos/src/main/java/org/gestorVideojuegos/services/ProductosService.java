package org.gestorVideojuegos.services;


import java.util.Optional;

import org.gestorVideojuegos.entities.ProductosEntity;
import org.gestorVideojuegos.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.gestorVideojuegos.pojos.FiltroProductosPojo;

@Service
public class ProductosService implements IProductosService{

	@Autowired
	private ProductosRepository repositorio;
	
	public Page<ProductosEntity> leerTodo(FiltroProductosPojo filtro, Pageable pagina) throws Exception{
																																																																	
			return repositorio.filtro(filtro.getNombreFiltro(),filtro.getSeccionFiltro(),filtro.getProveedorFiltro(),filtro.getStockFiltro(),filtro.getPrecioFiltro(),filtro.getFechaFiltro(), pagina);
}	
	public ProductosEntity leer(Long id) throws Exception{
		Optional<ProductosEntity> obj=repositorio.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}else {
			throw new Exception("Registro no existe");
		}
		
		
	}
	
	public void guardar (ProductosEntity entidad) {
		repositorio.save(entidad);
		
	}
	
	public void borrar(Long id) {
		repositorio.deleteById(id);
	}
}
