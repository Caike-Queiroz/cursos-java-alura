package modelo;

import java.io.Serializable;

/**
 * 
 * Classe que representa a moldura de uma conta
 * 
 * @author caike
 * 
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	/**
	 * 
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void depositar(double valor);
	
	/**
	 * 
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	/*public void setNumero(int numero) {
		
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}		
		this.numero = numero;
	}*/
	
	public int getAgencia() {
		return this.agencia;
	}
	
	/*public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}		
		this.agencia = agencia;
	}*/
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		// casting de genérica para mais específica 
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;			
		}
		
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
