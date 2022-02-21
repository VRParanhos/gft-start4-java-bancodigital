package com.bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirSaldo() {
        System.out.println("-- Extrato de Conta Corrente --");
        this.auxSaldo();
    }

}
