
public class TesteFuncionario {

	public static void main(String[] args) {
		
//		Funcionario cliente = new Cliente();
		
		Funcionario pedro = new Gerente();
		pedro.setNome("Pedro Silveira");
		pedro.setCpf("123.456.789-10");
		pedro.setSalario(1250);
		System.out.println(pedro.getBonificacao());
	}
}
