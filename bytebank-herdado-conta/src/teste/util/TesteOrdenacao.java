package teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33); 
		Cliente clienteCC1 = new Cliente(); 
		clienteCC1.setNome("Nico"); 
		cc1.setTitular(clienteCC1); 
		cc1.depositar(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44); 
		Cliente clienteCC2 = new Cliente(); 
		clienteCC2.setNome("Guilherme"); 
		cc2.setTitular(clienteCC2); 
		cc2.depositar(444.0);
		
		Conta cc3 = new ContaCorrente(22, 11); 
		Cliente clienteCC3 = new Cliente(); 
		clienteCC3.setNome("Paulo"); 
		cc3.setTitular(clienteCC3); 
		cc3.depositar(111.0); 
		
		Conta cc4 = new ContaPoupanca(22, 22); 
		Cliente clienteCC4 = new Cliente(); 
		clienteCC4.setNome("Ana"); 
		cc4.setTitular(clienteCC4); 
		cc4.depositar(222.0); 
		 
		List<Conta> lista = new ArrayList<>(); 
		lista.add(cc1); 
		lista.add(cc2); 
		lista.add(cc3); 
		lista.add(cc4);
		 
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		 
		//NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		//TitularDaContaComparator titularComparator = new TitularDaContaComparator();
		
		lista.sort(new TitularDaContaComparator());
		
		Collections.sort(lista, new NumeroDaContaComparator());
		Collections.sort(lista); //será organizado pela ordem natural definida na classe
		//Collections.reverse(lista);
		
		
		System.out.println("--------------");
		 
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome() + ", " + conta.getSaldo());
		}
		 
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}