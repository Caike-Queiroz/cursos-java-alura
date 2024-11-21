
public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (MinhaExcecao ex) {
			System.out.println("Msg: " + ex.getMessage());
		}
		System.out.println("Ini do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do método 2");
		throw new MinhaExcecao("deu muito errado");
	}
}