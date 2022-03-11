package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TeseArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(1234,4567);
		ContaCorrente cc2 = new ContaCorrente(6234,7890);
		ContaPoupanca cp1 = new ContaPoupanca(1234,2323);
		ContaPoupanca cp2 = new ContaPoupanca(6234,3131);
		ContaCorrente cc5 = new ContaCorrente(1274,4343);
		
       referencias[0] = cc1;
       referencias[1] = cc2;
       referencias[2] = cp1;
       referencias[3] = cp2;
       referencias[4] = cc5;
       
		System.out.println("Exibindo Array contas[]");
		for(int i = 0; i < referencias.length; i++) {
			System.out.println("posição: " + i + " - " + referencias[i]);
		}
		
		//Object ref = (ContaPoupanca) contas[1]; // type cast
		//System.out.println("testa referencia " + ref);

	}

}
