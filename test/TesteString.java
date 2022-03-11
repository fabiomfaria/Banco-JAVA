package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		//retorna se a String está vazia
		String y = "";
		System.out.println(y.isEmpty());
		
		//elimina os vazios
		y = " ";
		String z = y.trim();
		System.out.println(z.isEmpty());
		
		//elimina os espaços antes e depois do texto
		String h = " Jesus ";
	    String f = h.trim();
		System.out.println(f);
		
		String nome = "Jesus";
		String outra = nome.replace("Jesus", "Deus");
		System.out.println(nome);
		System.out.println(outra);
		
		//retorna se uma sequencia de caracter existe em uma String
		System.out.println(nome.contains("es"));
		
		//retorna a String em minusculo
		String minuscula = nome.toLowerCase();
		System.out.println(minuscula);
		
		// retorna a String em maiusculo
		String maiuscula = nome.toUpperCase();
		System.out.println(maiuscula);
		
		//substitui uma caracter especifico na String
		char c = 'J';
		char d = 'D';
		String nova = nome.replace(c, d);
		System.out.println(nova);
		
		// retorna o caracter que está na posição passada
		char x = nome.charAt(2);
		System.out.println(x);
		
		// retorna a posição inicial na string dos caracteres passados
		int pos = nome.indexOf("us");
		System.out.println(pos);
		
		//retorna uma Sub string apartir da posição passada
		String sub = nome.substring(1);
		System.out.println(sub);
		
		// retorna o tamanho da String
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		// mal pratica, usar a seguinte
		// String outro = new String("Alura");

	}

}
