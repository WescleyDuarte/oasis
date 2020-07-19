package br.edu.ufersa.model.VO;
import java.util.Calendar;
public class ConsultaVO {
	protected Paciente paciente;
	protected MedicoVO medico;
	protected Calendar data;
	
	public ConsultaVO() {
		
	}
	
	public ConsultaVO(Paciente paciente, MedicoVO medico, Calendar data) {
		
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public MedicoVO getMedico() {
		return medico;
	}
	
	public void setMedico(MedicoVO medico) {
		this.medico = medico;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
}
