package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesComposicao {

	public static void main(String[] args) {

		Orcamento antigo = new Orcamento();
		antigo.addItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.addItem(new ItemOrcamento(new BigDecimal("500")));
		novo.addItem(antigo);
		
		System.out.println(novo.getValor());
	}
}