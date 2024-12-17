package br.com.alura.loja.orcamento;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistraOrcamento {
	
	private HttpAdapter http;

	public RegistraOrcamento(HttpAdapter http) {
		this.http = http;
	}
	
	public void registrar(Orcamento orcamento) {
		//chamada HTTP para a API externa
		//URL Connection
		//HTTP Client
		//lib rest
		
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado!");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = new HashMap<String, Object>();
		dados.put("valor", orcamento.getValor());
		dados.put("quantidadeItens", orcamento.getQuantidadeItens());
		http.post(url, dados);
	}
}