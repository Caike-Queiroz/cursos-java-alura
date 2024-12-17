package br.com.alura.loja.descontos;

import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;

public class DescontoMaisCincoItens extends Desconto {

	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}