package com.iphone.entities;

import com.iphone.interfaces.INavegadorInternet;

import java.util.ArrayList;

public class NavegadorInternet implements INavegadorInternet {

    private String url;
    private ArrayList<String> abas = new ArrayList<>();

    public NavegadorInternet() {}

    public NavegadorInternet(String url) {
        this.url = url;
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);
        abas.add(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando aba...");   

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada: " + url);

    }
}

