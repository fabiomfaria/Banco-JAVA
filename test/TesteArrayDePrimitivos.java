package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	
	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicializa o array com 0 - o valor padr�o do tipo
		
		int idade = idades[0];
		System.out.println("A array INT � inicializa por padr�o com: " + idade);
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade1 = idades[0];
		System.out.println("A primeira idade �: " + idade1);
		int idade2 = idades[1];
		System.out.println("A segunda idade �: " + idade2);
		int idade3 = idades[2];
		System.out.println("A terceira idade �: " + idade3);
		int idade4 = idades[3];
		System.out.println("A quarta idade �: " + idade4);
		int idade5 = idades[4];
		System.out.println("A quinta idade �: " + idade5);
		
		
		System.out.println("-----------------------");
		System.out.println("Preenchendo a Array...");
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		System.out.println("Exibindo Array");
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	
		
	} 

}
