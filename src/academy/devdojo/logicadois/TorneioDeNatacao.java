package academy.devdojo.logicadois;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();

        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = digitar.nextInt(); // int idade = teclado.nextInt();

       // int idade = 22;
       // String nome = "Pedrinho";

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade < 16) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade < 20) {
            System.out.println(nome + " participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulta");
        }
    }
}
