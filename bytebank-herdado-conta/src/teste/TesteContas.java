package teste;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteContas {
	
	//java.lang.String
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.depositar(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.depositar(200.0);
		
		cc.transferir(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
