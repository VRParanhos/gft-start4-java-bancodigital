package com.bank;

public class Main {

    public static void main(String[] args) {
	Cliente victor = new Cliente();
    victor.nome = "Victor Resende Paranhos";
    victor.cpf = "10677174713";
    ContaCorrente ccVictor = new ContaCorrente(victor);
    ccVictor.depositar(100.00);
    ccVictor.imprimirSaldo();

    }
}
