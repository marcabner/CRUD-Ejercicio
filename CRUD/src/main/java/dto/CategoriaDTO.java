package dto;

import java.io.Serializable;

/**
 * DTOp para las categorias
 */
public class CategoriaDTO implements Serializable {

	
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
