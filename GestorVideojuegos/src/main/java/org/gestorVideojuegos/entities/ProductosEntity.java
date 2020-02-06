package org.gestorVideojuegos.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.gestorVideojuegos.JsonFecha;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="Productos")
public class ProductosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
		
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	private String seccion;
	
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
		
	private String proveedor;
	
	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
		
	private Integer stock;
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
		
	private Double precio;
	
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
		
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = JsonFecha.class)
	private Date fecha;

	public Date  getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha =fecha;
	}

	
	}
