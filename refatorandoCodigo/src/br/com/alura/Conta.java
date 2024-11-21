package br.com.alura;

public class Conta {
	
	private double saldo;
	
	public Conta(double valor) {
		this.saldo = valor;
	}

	public void setSaldo(double valor) {
		this.saldo += saldo;
	}
	
	public double getSaldo() {
		return 0;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
}