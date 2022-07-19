package cursodevsyonet.desafio01;

public class Exercicio03 {
    public static void main(String[] args) {
        String nome = "Remoção de caracteres: Dado um texto, vocês devem remover as vogais dele e retornar o texto sem estes caracteres";

        nome = nome.replaceAll("[AEIOUaeiou]", "");

//        nome = nome.replaceAll("e", "");
//        nome = nome.replaceAll("i", "");
//        nome = nome.replaceAll("o", "");
//        nome = nome.replaceAll("u", "");
//        nome = nome.replaceAll("A", "");
//        nome = nome.replaceAll("E", "");
//        nome = nome.replaceAll("I", "");
//        nome = nome.replaceAll("O", "");
//        nome = nome.replaceAll("U", "");

        System.out.println(nome);
    }
}
