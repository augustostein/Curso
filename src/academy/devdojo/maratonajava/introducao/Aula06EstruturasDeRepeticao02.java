package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int count = 0;
//        while(count < 1000000){
//            System.out.println(count);
//            count = count + 2;
//
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) { // <--- se o resto de "I" dividido por 2 for zero, temos um número par, independente do valor do "I" vai imprimir apenas os número pares
                System.out.println(i);

            }
        }
    }
}
