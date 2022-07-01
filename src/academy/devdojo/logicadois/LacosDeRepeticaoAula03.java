package academy.devdojo.logicadois;

import java.util.Scanner;

public class LacosDeRepeticaoAula03 {
    public static void main(String[] args){
        int novoMenu = 0;
        Scanner menu = new Scanner(System.in);
        while (novoMenu != 3) {
            System.out.println("Esclha a opção de menu: ");
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salario");
            System.out.println("3. Sair");
             novoMenu = menu.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
