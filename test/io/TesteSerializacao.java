package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("DEUS");
        cliente.setProfissao("Criador");
        cliente.setCpf("77777777777");

        ContaCorrente cc = new ContaCorrente(707, 377);
        cc.setTitular(cliente);
        cc.deposita(7777777777777.7);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

	}

}
