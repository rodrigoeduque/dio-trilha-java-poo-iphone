package br.com.rodrigoeduque;


import br.com.rodrigoeduque.core.impl.IphoneImpl;

public class Main {
    public static void main(String[] args) {
        IphoneImpl iphone = new IphoneImpl();

        System.out.println("IPHONE 58");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Comportamentos Aparelho Telefonico");
        iphone.ligar("34 9 9266-8122");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Comportamento Navegador Internet");
        iphone.exibirPagina("www.google.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Comportamento Reporodutor Musical");
        iphone.selecionarMusica("Jon Bon Jovi - Living on prayer");
        iphone.tocar();
        iphone.pausar();
        System.out.println("--------------------------------------------------------------------------------------");
    }
}