package inicio.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inicio.example.model.ProdutoEntity;

public interface ProductoRepository extends JpaRepository<ProdutoEntity, Long> {

}
