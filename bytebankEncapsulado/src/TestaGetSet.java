
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(42, 1337);
		//conta.numero = 1337;
		//conta.setNumero(-1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		Cliente titularDaConta = conta.getTitular();
		System.out.println(titularDaConta.getProfissao());
	}
}