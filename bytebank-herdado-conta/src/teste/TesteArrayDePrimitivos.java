package teste;

import java.util.Iterator;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicializa com o 0
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}
}