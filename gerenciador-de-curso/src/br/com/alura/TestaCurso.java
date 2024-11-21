package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
		//aulas.add(new Aula("Trabalhando co ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando co ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(aulas);
		
		System.out.println(aulas == javaColecoes.getAulas()); // aulas e getAulas são a msm coisa
	}
}