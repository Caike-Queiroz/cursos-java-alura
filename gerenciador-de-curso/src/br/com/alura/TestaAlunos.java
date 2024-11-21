package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Rodrigo Turini");
		alunos.add("Sergio Lopes");
		alunos.add("Mauricio Aniche");
		
		System.out.println(alunos);
		
		System.out.println(alunos.size());
		
		alunos.remove("Sergio Lopes");
		boolean sergioMatriculado = alunos.contains("Sergio Lopes");
		System.out.println("Sergio está matriculado ? " + sergioMatriculado);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
	}
}