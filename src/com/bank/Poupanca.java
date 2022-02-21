package com.bank;

public class Poupanca extends Conta {

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirSaldo() {
        System.out.println("-- Extrato de Conta Poupança --");
        this.auxSaldo();
    }
}