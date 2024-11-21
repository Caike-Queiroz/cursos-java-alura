package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(22, 22);
		contas[1] = cp2;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //type casting
		
		//System.err.println(cc2.getNumero());
		
		System.out.println(cp2.getNumero());
		System.out.println(ref.getNumero());
	}
}