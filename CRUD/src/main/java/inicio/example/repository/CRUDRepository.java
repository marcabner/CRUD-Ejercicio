package inicio.example.repository;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dto.ProductosDTO;
import inicio.example.model.CategoriaEntity;
import inicio.example.model.ProdutoEntity;

@Repository
public interface CRUDRepository extends JpaRepository<Long, CategoriaEntity> {

	
	public ProdutoEntity getProductById(Long id);
}
