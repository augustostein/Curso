package cursodevsyonet;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 1 && array[i] != 4) {
                System.out.println("i = " + array[i] + ", Este numero existe na matriz ");
            }


            else {
                System.out.println("i = " + array[i] + ", Este numero nao existe na matriz");
            }
        }
    }
}