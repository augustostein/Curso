package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadstroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu login: ");
        String login = input.next();
        if (login.equals("") || login.equalsIgnoreCase ("admin") || login.equalsIgnoreCase ("administrador")) {
            System.out.println("Usuário inválido");
        } else  {
            System.out.println("Usuário cadastrado com sucesso");
        }
    }
}
