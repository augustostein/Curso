package academy.devdojo.estruturascondicionais.ifselse;/*public class academy.devdojo.estruturascondicionais.ifselse.DiasDaSemana {
    public static void main(String [] args){
        int diasDaSemana = 4;
        if (diasDaSemana == 1){
            System.out.println("Hoje é Segunda-feira");
        } else if (diasDaSemana == 2) {
            System.out.println("Hoje é Terca-feira");
        } else if (diasDaSemana == 3) {
        System.out.println("Hoje é Quarta-feira");
        } else if (diasDaSemana == 4) {
        System.out.println("Hoje é Quinta-feira");
        } else if (diasDaSemana == 5) {
        System.out.println("Hoje é Sexta-feira");
         } else if (diasDaSemana == 6) {
        System.out.println("Hoje é Sábado");
         } else if (diasDaSemana == 7) {
        System.out.println("Hoje é Domingo");
        }
    }
}
*/


import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String [] args){
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite um número correspondente ao dia da semana: ");
        int diasDaSemana = imput.nextInt();
        if (diasDaSemana == 1){
            System.out.println("Hoje é Segunda-feira");
        } else if (diasDaSemana == 2) {
            System.out.println("Hoje é Terca-feira");
        } else if (diasDaSemana == 3) {
            System.out.println("Hoje é Quarta-feira");
        } else if (diasDaSemana == 4) {
            System.out.println("Hoje é Quinta-feira");
        } else if (diasDaSemana == 5) {
            System.out.println("Hoje é Sexta-feira");
        } else if (diasDaSemana == 6) {
            System.out.println("Hoje é Sábado");
        } else if (diasDaSemana == 7) {
            System.out.println("Hoje é Domingo");
        } else
            System.out.println("Dia inválido");
    }
}


