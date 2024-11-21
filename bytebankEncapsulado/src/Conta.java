class Conta {
	
	private double saldo;
	private int agencia = 42; // Valor padrao
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		System.out.println("O total de conta é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
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
}