package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //int array = {1, 2, 3}

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];// arrayInt[0] = array;
        arrayInt[1] = new int[3]; // pode ser feito também // arrayInt [1] = new int[]{1, 2, 3, 4, 5}
        arrayInt[2] = new int[6];


        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5}}; // outro modo para criar arrays


        for (int[] arrayBase : arrayInt) {
            System.out.println("-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
