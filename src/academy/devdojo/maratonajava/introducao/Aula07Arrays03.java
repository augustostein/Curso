package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3]; //ou numeros2
        numeros[0] = 15;
        numeros[1] = 21;
        numeros[2] = 11;
        int[] numeros2 = {1, 2, 3, 4, 5}; // ou numeros3
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);

//          }
        for (int num : numeros3) {
            System.out.println(num);


        }
//        int num = numeros3[0];          isso é oque acontece
//        System.out.println(num);      na linha 16 "debaixo dos panos"
//        num = numeros3[1];
//        System.out.println(num);
//        num = numeros3[2];
//        System.out.println(num);
//        num = numeros3[3];
//        System.out.println(num);
//        num = numeros3[4];
//        System.out.println(num);
//        num = numeros3[5];
//        System.out.println(num);
    }
}
