package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoManutencao extends Chamado {

public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.MANUTENCAO){
			return "Roberto resolverá sua solicitação";
		}
		else{
			
		}
		return "Não existe um profissional que resolva o seu chamado";
	}
}
