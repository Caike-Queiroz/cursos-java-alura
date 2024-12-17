package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistraOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistraOrcamento registro =  new RegistraOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}
}