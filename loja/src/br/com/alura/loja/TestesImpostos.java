package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.imposto.ImpostoZero;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println("Valor imposto: " + calculadoraDeImpostos.calcular(orcamento, new ImpostoZero(null)));
	}
}