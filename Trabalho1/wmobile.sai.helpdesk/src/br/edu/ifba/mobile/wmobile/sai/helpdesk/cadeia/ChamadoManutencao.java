package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoManutencao extends Chamado {

public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.MANUTENCAO){
			return "Roberto resolver� sua solicita��o";
		}
		else{
			
		}
		return "N�o existe um profissional que resolva o seu chamado";
	}
}
