package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoRedes extends Chamado {
	
public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.REDES){
			return "André resolverá sua solicitação";
		}
		else{
			
		}
		return proximo.resolver(chamado);
	}
}
