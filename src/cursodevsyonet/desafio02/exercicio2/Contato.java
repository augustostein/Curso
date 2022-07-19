package cursodevsyonet.desafio02.exercicio2;

import java.util.Scanner;

public class Contato {
    protected String nome;
    protected String telefone;
    protected String email;

    public Contato(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {
    }

    public void exibeDados() {


        System.out.println("Nome : " + this.nome);
        System.out.println("Telefone : " + this.telefone);
        System.out.println("Email : " + this.email);
    }


}
