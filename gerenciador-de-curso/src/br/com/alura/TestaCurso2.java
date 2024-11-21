package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		//aulas.add(new Aula("Trabalhando co ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando co ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//fizemos uma cópia mutável
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	}
}