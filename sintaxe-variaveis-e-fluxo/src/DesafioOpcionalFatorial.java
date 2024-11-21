
public class DesafioOpcionalFatorial {
	
	public static void main(String[] args) {
		
		int fatorial = 1;
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println(fatorial);
			fatorial *= numero; // fatorial = fatorial * numero;
		}
	}
}
