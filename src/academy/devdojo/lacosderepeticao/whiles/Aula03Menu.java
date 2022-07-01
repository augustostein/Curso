package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. depositar salário");
            System.out.println("3. Sair");
            System.out.println("Selecione a opção desejada:");
            opcao = teclado.nextInt();
        }
        System.out.println("Prograga encerrado");
    }
}
