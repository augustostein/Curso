package academy.devdojo.logicadois;

import java.util.Scanner;

public class LacosDeRepeticaoAula02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int valor = input.nextInt();
        int i = 0;
        while (i <= valor) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
