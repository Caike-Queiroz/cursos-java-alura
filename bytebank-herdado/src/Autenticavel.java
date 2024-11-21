// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar
		// metodo setSenha
		// metodo autenticar
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autenticar(int senha);
}
