
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Maior que 18");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Pode entrar com acompanhante");
			}
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}
}
