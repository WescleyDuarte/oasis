package br.edu.ufersa.model.VO;

public class PessoaVO{
	protected String nome;
	private String cpf;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) {
			System.out.println("sem nome");
			this.nome = "pessoa sem nome";
		}
		else {
			if (nome.equals(" ")) {
				System.out.println("sem nome");
				this.nome = "pessoa sem nome";
			}
			else {
				this.nome = nome;
			}
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public PessoaVO(String nome) {
		setNome(nome);
	}
	
	public PessoaVO(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public PessoaVO(String nome, String cpf, String endereco) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
	}

	public PessoaVO(){
	}
	
	public String toString() {
		String out = "";
		out = out + "/nNome: " + nome;
		out = out + "/nCPF: " + cpf;
		out = out + "/nEndereco: " + endereco;
		return out;
		
	}
}
