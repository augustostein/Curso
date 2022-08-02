package cursodevsyonet.exercicios;

public class ReplaceAll {
    public static void main(String[] args) {
        String frase = "Remover todas as vogais da variavel";

        frase = frase.replaceAll("[aeiouAEIOU]", "");

        System.out.println(frase);
    }
}
