package com.bank;

public class Cliente {
    //o valor pix indica se a pessoa já tem um PIX cadastrado ou não.
    // No programa em questão a única chave pix aceita é o CPF.
    public String nome;
    public String cpf;
    public boolean pix;
    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
        this.pix = false;
    }

    public void addPix(){
        this.pix = true;
    }
    public void dellPix(){
        this.pix = false;
    }



}
