package br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia;

public class ChamadoRedes extends Chamado {
	
public String resolver(TipoChamado chamado) {
		
		if (chamado == TipoChamado.REDES){
			return "Andr� resolver� sua solicita��o";
		}
		else{
			
		}
		return proximo.resolver(chamado);
	}
}
