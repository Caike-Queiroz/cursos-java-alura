package teste;
import modelo.ContaCorrente;

public class TesteSacar {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 321);
		
		cc.depositar(200.0);
		
		try {
			cc.sacar(210.0);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
		
	}
}
