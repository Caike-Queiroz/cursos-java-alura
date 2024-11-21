package test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import modelo.Cliente;
import modelo.ContaCorrente;


public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Caike");
		cliente.setProfissao("Dev");
		cliente.setCpf("528.422.068-43");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);;
		cc.depositar(222.3);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
	}
}