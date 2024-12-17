package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadorDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDeDescontos = new DescontoMaisCincoItens(new DescontoValorMaior500(new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}
}