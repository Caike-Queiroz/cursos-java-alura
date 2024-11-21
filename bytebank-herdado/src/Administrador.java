
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);
	}

}
