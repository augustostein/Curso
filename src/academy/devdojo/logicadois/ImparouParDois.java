package academy.devdojo.logicadois;

import java.util.Scanner;

public class ImparouParDois {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeros = numero.nextInt();
        if (numeros % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}

