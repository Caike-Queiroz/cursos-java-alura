
public class TestaFor {
	
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		// System.out.println(contador); | Não compila, por conta do escopo.
	}
}
