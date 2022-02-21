package com.bank;

public class Conta {
    /* Utilizaremos como angencia padrão o número 1 pois a maioria dos bancos digitais
     só possuem uma agência. */
    private final int AGENCIA_PADRAO = 1;

    /* o objeto "CONTAGEM_CONTA" será utilizado para garantir que não haja duas contas com o mesmo número,
    com o mesmo funcionamento de uma chave primária de um database*/
    private static int CONTAGEM_CONTA = 1;

    // definindo atributos
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = CONTAGEM_CONTA++;
        this.cliente = cliente;
        this.saldo = 0.00;
    }

    // a função temLimite analisa se a pessoa tem saldo para fazer a operação retornando valor booleano.
    public boolean temLimite(double valor){
        boolean b = valor <= saldo;
        return b;
    }
    public void sacar(double valor){
        if(temLimite(valor)) {
            this.saldo -= valor;
        } else {
            System.out.println("Operação não permitida");
            System.out.println("Saldo Insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contadestino){
        this.sacar(valor);
        if (this.temLimite(valor)) {
            contadestino.saldo += valor;
        }
    }

    // A função auxSaldo será usada como auxiliar na impressão do saldo
    // a ser definida nas classes ContaCorrente e Poupança.

    public void auxSaldo(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Seu saldo é R$ %.2f", this.saldo);
    }

}
