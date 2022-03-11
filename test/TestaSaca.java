package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200.25);
		try{
		conta.saca(210.05);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Saldo Insuficiente: " + ex.getMessage());
			//ex.printStackTrace();
		}
		System.out.println("Saldo Atual: " + conta.getSaldo());

	}

}
