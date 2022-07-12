package cursodevsyonet;

public class Exercicio03 {
    public static void main(String[] args) {
        String nome = "augusto";
        nome = nome.replaceAll("a", "");
        nome = nome.replaceAll("e", "");
        nome = nome.replaceAll("i", "");
        nome = nome.replaceAll("o", "");
        nome = nome.replaceAll("u", "");

        System.out.println(nome);
    }
}
