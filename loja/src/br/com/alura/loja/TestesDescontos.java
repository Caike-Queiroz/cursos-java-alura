package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

		CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
		System.out.println("Valor desconto: " + calculadorDeDescontos.calcular(orcamento));
		System.out.println("Valor desconto: " + calculadorDeDescontos.calcular(orcamento2));
	}
}