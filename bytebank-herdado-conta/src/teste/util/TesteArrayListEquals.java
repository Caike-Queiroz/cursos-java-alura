package teste.util;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
//		ContaCorrente cc1 = new ContaCorrente(22, 22);
//		ContaCorrente cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);	
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);	
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);	
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe ? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
