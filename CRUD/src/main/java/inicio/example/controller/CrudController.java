package inicio.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dto.CategoriaDTO;
import dto.ProductosDTO;
import inicio.example.service.CrudService;

@RestController
@RequestMapping (path = "/api")
public class CrudController {
	@Autowired
	private CrudService crudService;
	
	@GetMapping 
	@ResponseBody
	@ResponseStatus 
	@Validated 
	public List<CategoriaDTO> getAllCategories() {
		return ResponseEntity.ok(crudService.getCategorias());
	}
	
	@DeleteMapping
	public Integer deleteCategoria(Long id) {
		
		
	}
	@PostMapping 
	public ProductosDTO createProducto (ProductosDTO producto) {
		ProductosDTO procutoInsertado = crudService.createProducto(producto);
		return procutoInsertado;
	}

}
