package br.edu.ifba.mobile.wmobile.sai.helpdesk;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.Chamado;
import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.ChamadoInformatica;
import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.ChamadoManutencao;
import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.ChamadoRedes;
import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.ChamadoSistemas;
import br.edu.ifba.mobile.wmobile.sai.helpdesk.cadeia.TipoChamado;

@ManagedBean(name="atende")
@SessionScoped
public class Atendimento {
	
	private String email = "";
	private String senha = "";
	private String descricao = "";
	private String resultado = "";

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<String> getTipoChamado() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Informatica");
		tipos.add("Manutencao");
		tipos.add("Redes");
		tipos.add("Sistemas");

		return tipos;
	}
	
	public void setChamadoEscolhido(String tipoChamado) {
		
		TipoChamado tipo = TipoChamado.SEM_ATENDENTE;
		
		if (tipoChamado.equals("Informatica")) {
			tipo = TipoChamado.INFORMATICA;
		} else if (tipoChamado.equals("Manutencao")) {
			tipo = TipoChamado.MANUTENCAO;
		} else if (tipoChamado.equals("Redes")) {
			tipo = TipoChamado.REDES;
		} else if (tipoChamado.equals("Sistemas")) {
			tipo = TipoChamado.SISTEMAS;
		}
		
		Chamado chamado = new ChamadoInformatica();
		chamado.setProximoChamado(new ChamadoRedes());
		chamado.setProximoChamado(new ChamadoSistemas());
		chamado.setProximoChamado(new ChamadoManutencao());
		
		
		System.out.println("Agendado atendimento para " + email);

		resultado = chamado.resolver(tipo);
	}
	
	public String getResultado(){
		return resultado;
	}

}
