package cursodevsyonet;

import java.util.Scanner;

public class Exercicio02SomaImpar {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}