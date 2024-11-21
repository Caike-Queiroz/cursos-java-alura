
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Silveira";
		pedro.cpf = "123.456.789-00";
		pedro.profissao = "Programador";
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.depositar(100);
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro.titular.nome);
		System.out.println(contaDoPedro.titular);
		System.out.println(pedro);
	}
}
