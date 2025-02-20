package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<Telefone>();

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public void addTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
}