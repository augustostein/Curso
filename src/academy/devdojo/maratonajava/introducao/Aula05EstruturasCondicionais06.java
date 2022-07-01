package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){
        Scanner dia = new Scanner (System.in);
        System.out.println("Digite um número referente ao dia de semana");
        int diaDaSemana = dia.nextInt();
        //byte dia = 1;
        switch (diaDaSemana){
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Dia de semana");
                break;
            case 3:
                System.out.println("Dia de semana");
                break;
            case 4:
                System.out.println("Dia de semana");
                break;
            case 5:
                System.out.println("Dia de semana");
                break;
            case 6 :
                System.out.println("Dia de semana");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Data incorreta");
        }
//        case 1:
//        case 7:
//        System.out.println("Fim de semana");
//        break;
//        case 2:
//        case 3:
//        case 4:
//        case 5:
//        case 6:
//        System.out.println("Dia da semana");
//        break;
//        default:
//        System.out.println("Opção inválida");
//        break;

    }
}
