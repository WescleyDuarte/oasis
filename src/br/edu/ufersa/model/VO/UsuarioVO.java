package br.edu.ufersa.model.VO;

public class UsuarioVO extends PessoaVO {
	private String login;
	private String senha;
	
	public UsuarioVO() {
	}
	
	public UsuarioVO(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
