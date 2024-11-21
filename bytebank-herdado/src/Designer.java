
public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do DESIGNER");
		return 200;
	}

}