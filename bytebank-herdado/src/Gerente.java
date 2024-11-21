// Gerente é um funcionário, gerente herda da class Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil(); 
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario(); // super significa que este atributo foi definido na classe mãe (superClasse)
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