package academy.devdojo.logicadois;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args){
       Scanner sexo = new Scanner(System.in);
        System.out.println("Qual seu gênero?");
        String genero = sexo.next();

        Scanner idade = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idadeRecruta = idade.nextInt();

        if (genero.equalsIgnoreCase("masculino") && (idadeRecruta >= 18)){
            System.out.println("Alistamento obrigatório");
        } else if (genero.equalsIgnoreCase("masculino") && (idadeRecruta < 18)) {
            System.out.println("Alistamento não permitido");
        } else if (genero.equalsIgnoreCase("feminino") && (idadeRecruta >= 18)) {
            System.out.println("Gostaria de se alistar?");
        } else
            System.out.println("Alistamento não permitido");
    }
}
