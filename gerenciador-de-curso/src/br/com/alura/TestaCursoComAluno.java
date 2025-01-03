package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando co ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("---------------------------------------");
		
		for (Aluno aluno : javaColecoes.getAlunos()) {
			System.out.println(aluno);
		}
		
		System.out.println("---------------------------------------");
		
		Set<Aluno> alunosSet = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunosSet.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("O aluno " + a1 + " está matriculado: " + javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O ai é == ao turini? " + a1.equals(turini)); // true
		
		// obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == turini.hashCode()); // true
		
	}
}