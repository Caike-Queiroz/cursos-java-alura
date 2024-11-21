
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		// -------------------------------------------
		
//		Conexao conexao = null;
//		
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		} catch(Exception ex) {
//			System.out.println("Deu erro na conexao");
//		} finally { // Dando certo ou errado, esse bloco sera executado
//			System.out.println("finally");
//			if (conexao != null) {
//				conexao.close();
//			}
//		}
		
	}
}