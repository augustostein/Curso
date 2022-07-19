package cursodevsyonet.desafio02.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja INSERIR os dados da mensagem ou usar os dados de teste ? true/false     ");
        Boolean resposta = scan.nextBoolean();
        String lixo = scan.nextLine();
        Mensagem mensagem = new Mensagem() {
        };

        if (resposta == false) {
            Contato destinatario = new Contato();
            destinatario.nome = "Augusto Stein";
            destinatario.telefone = "(51)998789073";
            destinatario.email = "augusto.drehmer@syonet.com";
            Contato remetente = new Contato();
            remetente.nome = "Teste Syonet";
            remetente.telefone = "(xx)xxxxxxxxx";
            remetente.email = "syonet@syonet.com";

            mensagem.criaMensagem(destinatario, remetente);

        } else {
            System.out.println("Cadastrando o Remetente  ");
            Contato remetente = cadastroContato();


            System.out.println("Cadastrando o Destinatario  ");
            Contato destinatario =  cadastroContato();

            mensagem.criaMensagem(destinatario, remetente);
        }

    }

    private static Contato cadastroContato() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrando o Contato   ");

        System.out.println("Digite o NOME  ");
        String nome = scan.nextLine();

        System.out.println("Digite o NUMERO  ");
        String telefone = scan.nextLine();

        System.out.println("Digite o EMAIL  ");
        String email = scan.nextLine();

        return new Contato(nome, telefone, email);
    }



}
