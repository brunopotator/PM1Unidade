package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoSistemas extends Chamado {

public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.SISTEMAS){
			return "Paulo resolverá sua solicitação";
		}
		else{
			
		}
		return proximo.resolver(chamado);
	}
}
