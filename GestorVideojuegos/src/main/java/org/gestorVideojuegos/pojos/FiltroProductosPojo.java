package org.gestorVideojuegos.pojos;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class FiltroProductosPojo {
	
		private String nombreFiltro;	
	
	public String getNombreFiltro() {
		return nombreFiltro;
	}

	public void setNombreFiltro(String nombreFiltro) {
		this.nombreFiltro = nombreFiltro;
	}
	
		private String seccionFiltro;	
	
	public String getSeccionFiltro() {
		return seccionFiltro;
	}

	public void setSeccionFiltro(String seccionFiltro) {
		this.seccionFiltro = seccionFiltro;
	}
	
		private String proveedorFiltro;	
	
	public String getProveedorFiltro() {
		return proveedorFiltro;
	}

	public void setProveedorFiltro(String proveedorFiltro) {
		this.proveedorFiltro = proveedorFiltro;
	}
	
		private Integer stockFiltro;	
	
	public Integer getStockFiltro() {
		return stockFiltro;
	}

	public void setStockFiltro(Integer stockFiltro) {
		this.stockFiltro = stockFiltro;
	}
	
		private Double precioFiltro;	
	
	public Double getPrecioFiltro() {
		return precioFiltro;
	}

	public void setPrecioFiltro(Double precioFiltro) {
		this.precioFiltro = precioFiltro;
	}
	
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date fechaFiltro;	
	
	public Date getFechaFiltro() {
		return fechaFiltro;
	}

	public void setFechaFiltro(Date fechaFiltro) {
		this.fechaFiltro = fechaFiltro;
	}
}
