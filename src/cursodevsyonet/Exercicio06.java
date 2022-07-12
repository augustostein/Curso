package cursodevsyonet;

public class Exercicio06 {
    public static void main(String[] args) {

//        5) Apenas 1 e 4: Você deve fazer um método que avalia o array passado e diz se ele só contém 1 e 4

        int array[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1 || array[i] == 4) {
                System.out.println("i = " + array[i] + ", Este numero existe na matriz ");
                //array[i] =

            } else {
                System.out.println("i = " + array[i] + ", Este numero nao existe na matriz");
            }
        }
    }
}