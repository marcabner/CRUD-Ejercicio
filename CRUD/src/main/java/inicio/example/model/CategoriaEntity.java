package inicio.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity (name = "categoria")
@Data
public class CategoriaEntity {

	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	
}
