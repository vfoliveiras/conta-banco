import funcionalidades.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando o Reprodutor Musical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        // Testando o Aparelho Telefônico
        iphone.fazerLigacao();
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador
        iphone.exibirPagina();
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }

    // Reprodutor Musical

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada.");
    }

    // Aparelho Telefônico

    @Override
    public void fazerLigacao() {
        System.out.println("Chamando.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Você possui 13 mensagens!");
    }

    // Navegador

    @Override
    public void exibirPagina() {
        System.out.println("Página aberta.");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso!");
    }
}