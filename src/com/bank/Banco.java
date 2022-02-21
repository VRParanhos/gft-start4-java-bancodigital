package com.bank;

import java.util.Dictionary;
import java.util.Hashtable;

// essa classe será utilizada para configurar pix para uma conta, bem como armazenar chaves pix e
// fazer a pesquisa de pix de outras contas.
public class Banco {
    public Dictionary<String , Integer> dicionarioPix = new Hashtable<String, Integer>();



    public void addPix(String chavePix, Integer numeroConta){
        this.dicionarioPix.put(chavePix, numeroConta);
    }

    public void delPix(String chavePix){
        this.dicionarioPix.remove(chavePix);
    }

    public Integer checarPix(String chavePix){
        if (dicionarioPix.get(chavePix) != null) {
            int aux = dicionarioPix.get(chavePix);
            return aux;
        } else {
            return 0;
        }
    }

}
