package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "augusto90";
        final String password = "augusto1";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o seu login:");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite a sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso Concedido");
                break;
            }
                System.out.println("Acesso negado");
        }
        System.out.println("Programa encerrado");
    }
}


