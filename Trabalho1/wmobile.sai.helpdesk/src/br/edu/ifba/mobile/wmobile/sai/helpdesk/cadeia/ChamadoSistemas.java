package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoSistemas extends Chamado {

public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.SISTEMAS){
			return "Paulo resolver� sua solicita��o";
		}
		else{
			
		}
		return proximo.resolver(chamado);
	}
}
