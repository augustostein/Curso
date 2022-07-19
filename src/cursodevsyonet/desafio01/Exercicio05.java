package cursodevsyonet.desafio01;//package cursodevsyonet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

//        int array[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] != 1 && array[i] != 4) {
//                System.out.println("i = " + array[i] + ", Este numero existe na matriz ");
//            }
//            else {
//                System.out.println("i = " + array[i] + ", Este numero nao existe na matriz");
//            }
//        }
//  }
//

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        List<Integer> so1e4 = Arrays.asList(1, 4, 1, 4, 1, 4);
        System.out.println(valida(numeros));
        System.out.println(valida(so1e4));
    }

    static boolean valida(List<Integer> numeros) {
        for (Integer numero : numeros) {
            if (numero != 1 && numero != 4) {
                return false;
            }
        }
        return true;
    }
}




