package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.addItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundo = new Orcamento();
		segundo.addItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiro = new Orcamento();
		terceiro.addItem(new ItemOrcamento(new BigDecimal("500")));

		CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
		System.out.println("Valor desconto: " + calculadorDeDescontos.calcular(primeiro));
		System.out.println("Valor desconto: " + calculadorDeDescontos.calcular(segundo));
		System.out.println("Valor desconto: " + calculadorDeDescontos.calcular(terceiro));
	}
}