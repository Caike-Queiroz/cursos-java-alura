package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		// Deposita
		Conta contaDoPedro = new Conta();
		contaDoPedro.depositar(1000);
		System.out.println("Saldo da conta do Pedro: " + contaDoPedro.saldo);
		
		// Saque
		boolean saqueSucesso = contaDoPedro.sacar(320);
		System.out.println("Pedro conseguiu sacar: " + saqueSucesso);
		System.out.println("Saldo da conta do Pedro: " + contaDoPedro.saldo);
		
		// Transfere
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.depositar(1000);
		
		if(contaDaMarcela.transferir(300, contaDoPedro)) {
			System.out.println("Transferência com sucesso!");
		} else {
			System.out.println("Faltou dinheiro :(");
		}

		System.out.println("Saldo da conta do Pedro: " + contaDoPedro.saldo);
		
		contaDoPedro.titular = "Pedro Silveira";
		System.out.println(contaDoPedro.titular);
	}
}
