package br.com.rodrigoeduque.core.impl;

import br.com.rodrigoeduque.core.AparelhoTelefonico;
import br.com.rodrigoeduque.core.NavegadorInternet;
import br.com.rodrigoeduque.core.ReprodutorMusical;

public class IphoneImpl implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA  " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica : " + musica + " selecionada com sucesso!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBIR PAGINA : " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");
    }
}
