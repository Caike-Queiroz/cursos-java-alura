import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//Collections.sort(palavras, comparador);
		
		palavras.sort(( s1, s2) -> s1.length() - s2.length());

		System.out.println(palavras);
		
		palavras.sort(Comparator.comparing(String::length)); //method reference
		palavras.sort(Comparator.comparing(s -> s.length())); //lambda
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
//		
//		palavras.forEach(consumidor);
		
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});
	}
}