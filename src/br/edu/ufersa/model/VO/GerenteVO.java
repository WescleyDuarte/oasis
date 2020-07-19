package br.edu.ufersa.model.VO;

public class GerenteVO extends UsuarioVO {
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String toString() {
		String out = "";
		out = out + "\nId: " + id;
		out = super.toString();
		return out;
	}
}
