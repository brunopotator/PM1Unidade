package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoInformatica extends Chamado {

	@Override
	public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.INFORMATICA){
			return "Tiago resolverá sua solicitação";
		}
		else{
			
		}
		return proximo.resolver(chamado);
	}
}
