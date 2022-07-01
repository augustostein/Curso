package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class NewParticipantesNatacao {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade < 11) {
            System.out.println(nome+" paticipará da categoria infantil");
        }else if  (idade >= 11 && idade <= 15) {
            System.out.println(nome+" participará da categoria juvenil");
        }else if (idade >= 17 && idade <= 19){
            System.out.println(nome+" participará da categoria pré-adulto");
        } else {
            System.out.println(nome+" participará da categoria adulto");
        }
    }
}