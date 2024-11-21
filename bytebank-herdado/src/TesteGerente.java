
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Administrador();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Gerente 01");
		g1.setCpf("980.789.342-23");
		g1.setSalario(5000.0);
		g1.setSenha(2222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println("Bonificação " + g1.getBonificacao());
		
		boolean autenticou = g1.autenticar(2222);
		System.out.println(autenticou);
	}
}
