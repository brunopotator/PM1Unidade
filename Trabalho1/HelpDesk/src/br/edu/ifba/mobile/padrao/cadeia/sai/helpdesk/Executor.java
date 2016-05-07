package br.edu.ifba.mobile.padrao.cadeia.sai.helpdesk;

public class Executor {

	public static void main(String[] args) {
		
		Chamado chamado = new ChamadoInformatica();
		chamado.setProximoChamado(new ChamadoRedes());
		chamado.setProximoChamado(new ChamadoSistemas());
		chamado.setProximoChamado(new ChamadoManutencao());

	}

}
