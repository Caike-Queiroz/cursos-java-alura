
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(42, 1337);
		
		//conta.setAgencia(-50);
		//conta.setNumero(-30);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(22 , 333);
		
		System.out.println(Conta.getTotal());
	}
}
