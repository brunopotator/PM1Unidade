package br.edu.ifba.mobile.padrao.cadeia.sai.helpdesk;

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
