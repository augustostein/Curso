package academy.devdojo.logicadois;

public class DoWhileAula02DoisDois {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("A tabuada do número " + i + " é: ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("--------------");

        }
    }
}
