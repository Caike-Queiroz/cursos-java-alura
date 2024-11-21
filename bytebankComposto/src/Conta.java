class Conta {
	private double saldo;
	int agencia = 42; // Valor padrao
	int numero;
	Cliente titular;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transferir(double valor, Conta destino) {
		
		boolean podeTransferir = this.sacar(valor);
		if (podeTransferir) {			
			destino.depositar(valor);
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}