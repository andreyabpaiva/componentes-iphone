package com.iphone.entities;

import com.iphone.interfaces.IAparelhoTelefonico;

import java.util.ArrayList;

public class AparelhoTelefonico implements IAparelhoTelefonico {

    private String numero;
    private boolean ligar;
    private ArrayList<String> historicoContatos = new ArrayList<>();


    @Override
    public void ligar(String numero) {
        this.ligar = true;
        historicoContatos.add(numero);
    }

    @Override
    public void atender() {
        this.ligar = false;
        System.out.println("em chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        this.ligar = true;
        System.out.println("Correio voz");
    }

}
