package com.bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirSaldo() {
        System.out.println("-- Extrato de Conta Corrente --");
        this.auxSaldo();
    }

}
