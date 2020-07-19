package br.edu.ufersa.model.VO;

public class MedicoVO extends PessoaVO {
	protected double valorConsulta;
	public long codConselho;
	
	public MedicoVO() {
	}
	
	public MedicoVO(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}
	
	public double getValor () {
		return valorConsulta;
	}
	
	public void setValor(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	public long getCodigo() {
		return codConselho;
	}
	
	public void setCodigo(long codConselho) {
		this.codConselho = codConselho;
	}
	
	
	
}
