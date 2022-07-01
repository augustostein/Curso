package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count); //System.out.println(++count);
            count = count + 1; // count += 1, ++count, count++, variações

            do {
                System.out.println("Dentro do DO-WHILE " + ++count);
            } while (count < 10);

            for (int i = 0; i < 10; i++) {
                System.out.println("For "+i);
            }
        }
    }
}
