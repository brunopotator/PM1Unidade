package br.edu.ifba.mobile.padrao.cadeia.sai.helpdesk;

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
