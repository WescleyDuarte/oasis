package br.edu.ufersa.model.VO;
import java.util.Calendar;
public class Paciente extends PessoaVO {
	
	Prontuario prontuario = new Prontuario();
	
	public Paciente() {
	}
	
	public Paciente(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}
	
	public Calendar getData() {
		return prontuario.data;
	}
	
	public void setData(Prontuario prontuario) {
		this.prontuario.data = prontuario.data;
	}
	
	public String getObs() {
		return prontuario.obs;
	}
	
	public void setObs(Prontuario prontuario) {
		this.prontuario.obs = prontuario.obs;
	}
	
	public String toString() {
		String out = "";
		out = out + super.toString();
		out = out + "Data Prontuario: " + prontuario.data;
		out = out + "OBS Prontuario: " + prontuario.obs;
		return out;
	}
}
