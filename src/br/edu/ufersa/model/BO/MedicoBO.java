package br.edu.ufersa.model.BO;
import br.edu.ufersa.model.VO.*;
import br.edu.ufersa.model.DAO.*;

public class MedicoBO {
	static long codGenerator = 1;
	MedicoDAO dao = new MedicoDAO();
	public void gerarProntuario(Paciente paciente) {
		
	}
	
	public void inserir(MedicoVO medico) {
		medico.setCodigo(codGenerator);
		codGenerator++;
		System.out.println("Adicionado o medico " + medico.getNome() + " com os seguintes dados: \n");
	}
}
