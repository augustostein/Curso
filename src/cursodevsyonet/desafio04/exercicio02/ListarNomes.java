package cursodevsyonet.desafio04.exercicio02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. Implemente um método que recebe uma lista de nomes e um caractere e retorne apenas os nomes que iniciem com esse caractere.

public class ListarNomes {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Mateus", "Renan", "Jonathan", "Augusto", "Julian", "Betina","Gabriel",
                "Louise", "Helio", "Tiago", "Amanda");


        nomes = nomesListagem(nomes, 'A');
        nomes.forEach(System.out::println);

    }
    public static List<String> nomesListagem(List<String> nomes, Character caracter) {

        List<String> nomesListagem = nomes.stream().filter(nome -> nome.startsWith(caracter.toString())).sorted().collect(Collectors.toList());
        return nomesListagem;
    }
}


