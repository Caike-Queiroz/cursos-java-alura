package br.com.alura.loja.descontos;

import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null); // n existe mais uma regra de desconto
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}