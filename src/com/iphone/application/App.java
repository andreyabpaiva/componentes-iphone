package com.iphone.application;

import com.iphone.entities.AparelhoTelefonico;
import com.iphone.entities.NavegadorInternet;
import com.iphone.entities.ReprodutorMusical;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ligando aparelho...");

        System.out.println("-------------------------------------------");

        System.out.println("1) TELEFONE");
        System.out.println("2) MUSICA");
        System.out.println("3) SAFARI");

        int escolhaUsuario = scanner.nextInt();

        switch (escolhaUsuario){
            case 1:
                AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

                System.out.println("1) LIGAR");
                System.out.println("2) ATENDER");
                System.out.println("3) CORREIO DE VOZ");

                int escolhaTelefone = scanner.nextInt();

                if (escolhaTelefone==1){

                    System.out.print("número: ");
                    String numero = scanner.next();
                    aparelhoTelefonico.ligar(numero);

                    System.out.println("ligando para..."+numero);

                }else if(escolhaTelefone==2){

                    aparelhoTelefonico.atender();

                } else if(escolhaTelefone==3){

                    aparelhoTelefonico.iniciarCorreioVoz();
                }

                break;

            case 2:
                ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

                System.out.println("adicione as músicas à playlist");

                boolean n = true;
                while(n){

                    System.out.print("digite nome da musica: ");
                    String nomeMusica = scanner.next();

                    reprodutorMusical.addMusicas(nomeMusica);

                    System.out.println("");
                    System.out.print("deseja continuar? ");

                    String resposta = scanner.next();

                    if(resposta.equals("não")){
                        n=false;
                    }

                }

                System.out.println("1) SELECIONAR MUSICA");
                System.out.println("2) TOCAR");
                System.out.println("3) PAUSAR");

                int escolhaReprodutorMusical = scanner.nextInt();

                if (escolhaReprodutorMusical==1){

                    System.out.print("qual musica deseja selecionar? ");
                    String musicaSelecionada = scanner.next();

                    reprodutorMusical.selecionarMusica(musicaSelecionada);

                    System.out.println("escutando: "+musicaSelecionada);

                } else if (escolhaReprodutorMusical==2){
                    reprodutorMusical.tocar();
                } else if(escolhaReprodutorMusical==3){
                    reprodutorMusical.pausar();
                }

                break;

            case 3:

                NavegadorInternet navegadorInternet = new NavegadorInternet();

                System.out.println("1) ADD NOVA ABA");
                System.out.println("2) EXIBIR PAGINA");
                System.out.println("3) ATUALIZAR PAGINA");

                int escolhaNavegador = scanner.nextInt();

                if(escolhaNavegador==1){
                    navegadorInternet.adicionarNovaAba();
                    System.out.println("aba adicionada");

                } else if (escolhaNavegador==2){
                    System.out.print("qual pagina deseja exibir? ");
                    String urlEscolhida = scanner.next();

                    navegadorInternet.exibirPagina(urlEscolhida);

                } else if (escolhaNavegador==3){
                    navegadorInternet.atualizarPagina();
                }


        }


        scanner.close();

    }
}