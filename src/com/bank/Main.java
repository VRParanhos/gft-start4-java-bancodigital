package com.bank;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
	    Cliente victor = new Cliente();
        victor.nome = "Victor Resende Paranhos";
        victor.cpf = "10677174713";
        ContaCorrente ccVictor = new ContaCorrente(victor, banco);
        ccVictor.adicionarPix();
        ccVictor.adicionarPix();
        ccVictor.depositar(100.00);
        ccVictor.sacar(150.00);
        ccVictor.imprimirSaldo();

    }
}
