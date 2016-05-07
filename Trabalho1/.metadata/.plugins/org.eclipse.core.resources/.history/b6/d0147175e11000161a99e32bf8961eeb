package br.edu.ifba.mobile.padrao.cadeia.sai.helpdesk;

public abstract class Chamado {
	
	protected Chamado proximo = null;
	
	public void setProximoChamado(Chamado proximo){
		
		if(this.proximo != null){
			this.proximo.setProximoChamado(proximo);
		} else {
			this.proximo = proximo;
		}
	}
	
	public abstract String resolver(TipoChamado chamado);
		
}

