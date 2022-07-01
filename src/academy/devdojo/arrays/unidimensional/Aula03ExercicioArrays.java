package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[9];
        int[] array2 = new int[9];
        int[] array3 = new int[9];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1, posição " + i + " ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2, posição " + i + " ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("O Array3 multiplicado é :");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];

            System.out.print(array3[i] + " ");
        }
    }
}