package teste;
import modelo.CalculadorImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.depositar(100.0);

		SeguroDeVida sv = new SeguroDeVida(); 
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc); // 1
		calc.registra(sv); // 42
		
		System.out.println(calc.getTotalImposto());
	}

}
