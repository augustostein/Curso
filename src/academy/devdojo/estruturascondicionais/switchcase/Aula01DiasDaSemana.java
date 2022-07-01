package academy.devdojo.estruturascondicionais.switchcase;
/*
public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Hoje é Segunda-feira");
                break;
            case 2:
                System.out.println("Hoje é Terca-feira");
                break;
            case 3:
                System.out.println("Hoje é Quarta-feira");
                break;
            case 4:
                System.out.println("Hoje é Quinta-feira");
                break;
            case 5:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 6:
                System.out.println("Hoje é Sábado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
                break;
            default: System.out.println("Dia inválido");
        }
        System.out.println("Fim do programa");
    }
}
*/

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Digite o número referente ao dia da semana: ");
        int dia = imput.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Hoje é Segunda-feira");
                break;
            case 2:
                System.out.println("Hoje é Terca-feira");
                break;
            case 3:
                System.out.println("Hoje é Quarta-feira");
                break;
            case 4:
                System.out.println("Hoje é Quinta-feira");
                break;
            case 5:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 6:
                System.out.println("Hoje é Sábado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
                break;
            default: System.out.println("Dia inválido");
        }
        System.out.println("Fim do programa");
    }
}
