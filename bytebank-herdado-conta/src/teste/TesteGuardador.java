package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		ContaCorrente cc = new ContaCorrente(22, 11);	
		guardador.adicionar(cc);
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);	
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
