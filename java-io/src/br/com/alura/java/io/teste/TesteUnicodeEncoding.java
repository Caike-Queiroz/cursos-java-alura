package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws Exception {

		String s = "ç";
		System.out.println(s.codePointAt(0)); // unicode
		
		Charset charset = Charset.defaultCharset(); // UTF-8
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + " , " + "windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
	
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " , " + "UTF-16, ");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
	
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " , " + StandardCharsets.US_ASCII);
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);
		
		
	}
}