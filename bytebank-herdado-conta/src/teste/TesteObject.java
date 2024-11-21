package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cl = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);

		//println(cl);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	
	static void println(Object valor) {}
}
