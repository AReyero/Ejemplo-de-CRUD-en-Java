package org.gestorVideojuegos.controllers;

import java.util.HashMap;
import java.util.Map;

import org.gestorVideojuegos.entities.ProductosEntity;
import org.gestorVideojuegos.services.IProductosService;
import org.gestorVideojuegos.pojos.FiltroProductosPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Productos")
public class ProductosController {
	
	@Autowired
	private IProductosService servicio;
	
	@GetMapping("/Vista")
	public String vista() {
		return "Productos";
	}
	
	@GetMapping("/LeerID")
	@ResponseBody
	public Map leer(Long id) {
		HashMap<String, Object> res= new HashMap<String, Object>();
		try {
			res.put("data", servicio.leer(id));
								
		} catch (Exception e) {
			res.put("error", "Ha habido un error");
		}
		return res;
	}

	@GetMapping("/BorrarID")
	@ResponseBody
	public Map borrar(Long id) {
		HashMap<String, Object> res= new HashMap<String, Object>();
		try {
			servicio.borrar(id);
								
		} catch (Exception e) {
			res.put("error", "Ha habido un error");
		}
		return res;
	}

	@PostMapping("/Guardar")
	@ResponseBody
	public Map guardar(ProductosEntity entidad) {
		HashMap<String, Object> res= new HashMap<String, Object>();
		try {
			servicio.guardar(entidad);
								
		} catch (Exception e) {
			res.put("error", "Ha habido un error");
		}
		return res;
	}
	
	@GetMapping("/LeerAll")
	@ResponseBody
	public Map leerAll(FiltroProductosPojo filtro, String sort, String order , int offset,int limit) {
		//search cuadrito de buscar sort es la columna,order es ascendente odescendente, 
		//offset numero de registro donde empiezas a mostrar,limit tamañode cada pagina
		HashMap<String, Object> res= new HashMap<String, Object>();
		try {
			
			Pageable pagina=PageRequest.of(offset/limit, limit);
			if(sort!=null){
				if ("asc".equals(order)) {
					pagina=PageRequest.of(offset/limit, limit, Sort.by(sort));
				}else {
					pagina=PageRequest.of(offset/limit, limit, Sort.by(sort).descending());
				}
			}
			Page<ProductosEntity> lista=servicio.leerTodo(filtro, pagina);//Page da la lista y la informacion del paginado
			res.put("rows", lista.getContent());//lista de elementos visibles rows y total es obligado por bootstrap table
			res.put("total", lista.getTotalElements());//lista total de elementos, el numero total. le ayuda a generar el numero de paginas
		} catch (Exception e) {
			res.put("error", "Ha habido un error");
		}
		return res;
	}

}
