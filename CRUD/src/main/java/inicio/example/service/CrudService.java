package inicio.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CategoriaDTO;
import dto.ProductosDTO;
import inicio.example.model.CategoriaEntity;
import inicio.example.repository.CRUDRepository;
import inicio.example.repository.ProductoRepository;

@Service
public class CrudService {
	/**
	 * Repository para Categoria
	 */
	@Autowired
	private  CRUDRepository repository;
	/**
	 * Repository para Prodcuto
	 */
	@Autowired
	private  ProductoRepository prodcutoRepository;
	
	public List<CategoriaDTO> getCategorias() {
		ArrayList<CategoriaDTO> lista = null;
		
		return lista;
	}
	
	public ProductosDTO getProductById(Long id) {
		ProductosDTO producto= null;
		repository.getProductById(id);
		return producto;
	}
	
	public void deleteCategoria(Long id) {
		repository.delete(id);
	}

	public CategoriaEntity findCategoria(Long id) {
		
	}
	
	public ProductosDTO createProducto(ProductosDTO dto) {
		prodcutoRepository.save(null)
	}
}
