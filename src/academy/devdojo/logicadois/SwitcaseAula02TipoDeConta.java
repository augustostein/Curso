package academy.devdojo.logicadois;

import java.util.Scanner;

public class SwitcaseAula02TipoDeConta {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        System.out.println("Digite seu tipo de conta: ");
        String tipoDeConta = conta.next();

        switch (tipoDeConta) {
            case "poupanca":
                System.out.println("Sua conta é do tipo: " + tipoDeConta + " e sua porcentagem de juros é 5%");
                break;
            case "corrente":
                System.out.println("Sua conta é do tipo: " + tipoDeConta + " e sua porcentagem de juros é 2%");
                break;
            case "investimento":
                System.out.println("Sua conta é do tipo: " + tipoDeConta + " e sua porcentagem de juros é 10%");
                break;
            default:
                System.out.println("Conta inexistente");
                break;
        }
    }
}
