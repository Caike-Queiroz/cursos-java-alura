package br.com.alura;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContaTest {

	@Test
	public void aoSacarUmValorDeUmaContaSaldoDeveSofrerUmaSubtracaoDesseValor() {
		
		Conta conta = new Conta(200);
		conta.sacar(50);
		
		assertThat(conta.getSaldo(), is(equalTo(150)));
	}
}