package cursodevsyonet.desafio01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número maior ou igual a 1: ");
            int numero = 0;
            while (numero <= 1) {
                numero = teclado.nextInt();
            }

            boolean primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("O número é primo");
            } else {
                System.out.println("Não é primo");
            }

        } catch (Exception e) {
            System.out.println("Falha :" + e.getMessage());
        }
    }
}


//        for (int i = 2; i < numero; i++){
//        if(numero % i == 0){
//        return false;
//        }
//      }
//        return true;
//   }