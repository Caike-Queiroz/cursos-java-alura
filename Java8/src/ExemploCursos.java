import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso { 
   private String nome; 
   private int alunos; 
 
   public Curso(String nome, int alunos) { 
    	this.nome = nome;
        this.alunos = alunos; 
   } 
 
   public String getNome() { 
    	return nome; 
   } 
 
   public int getAlunos() { 
    	return alunos; 
   }
}

public class ExemploCursos {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //method reference
		cursos.forEach(c -> System.out.println(c.getNome()));//lambda
		
		OptionalDouble media = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.average();
		
		System.out.println(media);
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny()
//			.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
						c -> c.getNome(), 
						c -> c.getAlunos()))
			.forEach((nome, qntAlunos) -> System.out.println(nome + " tem " + qntAlunos + " alunos"));
		
		cursos.stream() 
			.filter(c -> c.getAlunos() > 50)
			.findFirst();
		
		OptionalDouble average = cursos.stream()
			.mapToDouble(Curso::getAlunos)
			.average();
		
		System.out.println(average);
		
		List<Curso> lstAlunos = cursos.stream() 
				.filter(c -> c.getAlunos() > 50)
				.collect(Collectors.toList());
	}
}