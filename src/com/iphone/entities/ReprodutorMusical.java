package com.iphone.entities;

import com.iphone.interfaces.IReprodutorMusical;

import java.util.ArrayList;

public class ReprodutorMusical implements IReprodutorMusical {

    private boolean proximaFaixa;
    private boolean faixaAnterior;
    private boolean iniciarMusica;
    private boolean pausarMusica;
    private ArrayList<String> playlist = new ArrayList<>();

    public ReprodutorMusical() {

    }

    @Override
    public void tocar() {
        this.iniciarMusica = true;
        System.out.println("tocando...");
    }

    @Override
    public void pausar() {
        this.pausarMusica = false;
        System.out.println("pausado.");
    }

    @Override
    public void selecionarMusica(String musica) {
        for (String musicaSelecionada : playlist){
            if (musica.equals(musicaSelecionada)){
                this.iniciarMusica = true;
                break;
            }
        }
    }

    public void addMusicas(String musica){
        playlist.add(musica);
    }
}
