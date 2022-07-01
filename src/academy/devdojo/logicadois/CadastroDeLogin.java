package academy.devdojo.logicadois;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu login: ");
        String usuario = input.next();
        if (usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador") || usuario.equals("")) {
            System.out.println(usuario + " usuário inválido");
        } else {
        System.out.println(usuario + " cadastrado com sucesso");
        }
    }
}