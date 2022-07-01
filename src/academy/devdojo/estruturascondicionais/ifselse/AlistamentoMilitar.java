package academy.devdojo.estruturascondicionais.ifselse;/*
public class academy.devdojo.estruturascondicionais.ifselse.AlistamentoMilitar {
    public static void main(String [] args) {
        char sexo = 'F';
        int idade = 18;
        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if ((sexo == 'M') && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if ((sexo == 'F') && idade >= 18) {
            System.out.println("Gostaria de fazer o alistamento militar?");
        }
    }
}
*/

import java.util.Scanner;
public class AlistamentoMilitar {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        Scanner militar = new Scanner(System.in);
        System.out.println("Agora, digite seu sexo: ");
        String sexo = input.next();
        if ((sexo.equals ("M") || sexo.equals("F")) && idade < 18) {
            System.out.println("Alistamento não permitido ");
        } else if ((sexo.equals ("M")) && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if ((sexo.equals("F")) && idade >= 18) {
            System.out.println("Gostaria de fazer o alistamento militar?");
        }
    }
}

