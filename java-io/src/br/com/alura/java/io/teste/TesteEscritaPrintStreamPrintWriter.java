package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.println();
		pw.println("My name is Caikeeeeeeee");
		
		pw.close();
		
		System.out.println();
	}

}
