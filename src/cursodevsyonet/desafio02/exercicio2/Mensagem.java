package cursodevsyonet.desafio02.exercicio2;

import java.util.Scanner;

public class Mensagem {
    String conteudo;
    String titulo;
    Contato remetente = new Contato();
    Contato destinatario = new Contato();

    public void Mensagem() {
    }

    public void envioSMS(String conteudo, String titulo, Contato remetente, Contato destinatario) {

        this.exibeDados2Contatos(destinatario, remetente);

        System.out.println("Enviando através de um 'SMS'   ");
        System.out.println("Titulo do SMS    " + this.titulo);
        System.out.println("Conteudo do SMS   " + this.conteudo);
    }

    public void envioEmail(String conteudo, String titulo, Contato remetente, Contato destinatario) {




        this.exibeDados2Contatos(destinatario, remetente);

        System.out.println("\n Dados da Mensagem   ");
        System.out.println("\n Enviando um EMAIL   ");
        System.out.println("\n Titulo do E-mail     " + titulo);
        System.out.println("\n Conteudo do E-Mail      " + conteudo);
    }

    public Mensagem criaMensagem(Contato destinatario, Contato remetente) {

        System.out.println("Insira os dados da Mensagem  ");

        Mensagem mensagem = new Mensagem();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o TITULO da mensagem:   ");
        titulo = scan.nextLine();
        System.out.println("Digite a MENSAGEM:   ");
        conteudo = scan.nextLine();
        System.out.println("Envia via SMS ou E-MAIL? " + "' 1 - para envia SMS' \n ' 2 - para envia E-MAIL '   ");
        int resposta = scan.nextInt();
        String lixo = scan.nextLine();
        if (resposta == 1) {
            envioSMS(conteudo, titulo, destinatario, remetente);
        } else {
            envioEmail(conteudo, titulo, destinatario, remetente);
        }

        return mensagem;
    }

    private void exibeDados2Contatos(Contato destinatario, Contato remetente) {
        System.out.println("\n Dados do Remetente: ");
        remetente.exibeDados();
        System.out.println("\n Dados do Destinatario");
        destinatario.exibeDados();
    }
}
