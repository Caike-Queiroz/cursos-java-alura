package br.com.alura.loja.descontos;

import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;

public class DescontoValorMaior500 extends Desconto {

	public DescontoValorMaior500(Desconto proximo) {
		super(proximo);
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
}