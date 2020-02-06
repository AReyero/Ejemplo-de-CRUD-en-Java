package org.gestorVideojuegos.repositories;

import org.gestorVideojuegos.entities.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;

public interface ProductosRepository extends JpaRepository<ProductosEntity, Long>{
		
																																																									
		@Query("select a from ProductosEntity a  where a.nombre like %:nombre% and a.seccion like %:seccion% and a.proveedor like %:proveedor% and (a.stock =  :stock or :stock is null) and (a.precio =  :precio or :precio is null) and (a.fecha =  :fecha or :fecha is null) ")
		public Page<ProductosEntity> filtro(String nombre,String seccion,String proveedor,Integer stock,Double precio,Date fecha, Pageable page);

}
