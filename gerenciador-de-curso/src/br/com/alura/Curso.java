package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
		int tempoTotal = 0;
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
		
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
		
		return matriculaParaAluno.get(numero);		
	}
}