package teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5]; // cada casa guarda um primitivo
		String[] nomes = new String[5]; // cada casa guarda uma referência
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(idade); // autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(idadeRef.MIN_VALUE);
		System.out.println(idadeRef.MAX_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // unboxing
		
		String s = args[0]; //"10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
	}
}
