package academy.devdojo.logicadois;

import java.util.Scanner;

public class LacosDeRepeticaoAula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "augusto90";
        final String password = "augusto1";
        Scanner type = new Scanner(System.in);
        boolean exibirtelaLogin = true;
        while (exibirtelaLogin) {
            System.out.println("Digite o seu login: ");
            String loginDigitado = type.next();
            System.out.println("Digite sua senha: ");
            String passwordDigitado = type.next();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirtelaLogin = false;
            } else {
                System.out.println("ACESSO NEGADO");
            }
        }
    }
}