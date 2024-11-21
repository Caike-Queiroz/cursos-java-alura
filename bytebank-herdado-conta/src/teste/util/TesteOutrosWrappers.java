package teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer intRef = Integer.valueOf(29); //autoboxing
		System.out.println(intRef.intValue()); //unboxing
		
		Double doubleRef = Double.valueOf(3.2); //autoboxing
		System.out.println(doubleRef.doubleValue()); //unboxing
		
		Boolean booleanRef = Boolean.valueOf(false);
		booleanRef = Boolean.TRUE;
		System.out.println(booleanRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}
}
