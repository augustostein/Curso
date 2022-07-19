package cursodevsyonet.desafio01;

import java.util.Scanner;

public class Exercicio02SomaPares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int total = teclado.nextInt();
        int soma = 0;

        for (int i = 0; i <= total; i++) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
        }
        System.out.println("A soma total dos números pares é: " + soma);
    }
}