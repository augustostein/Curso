package cursodevsyonet.desafio04.exercicio02;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 2. Implemente um método que recebe uma lista de nomes e um caractere e retorne apenas os nomes que iniciem com esse caractere.

public class ListarNomes {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Mateus");
        nomes.add("Renan");
        nomes.add("Jonathan");
        nomes.add("Augusto");
        nomes.add("Julian");
        nomes.add("Betina");
        nomes.add("Gabriel");
        nomes.add("Louise");
        nomes.add("Helio");
        nomes.add("Tiago");
        nomes.add("Amanda");

        nomes = nomesListagem(nomes, 'A');
        nomes.forEach(System.out::println);

    }
    public static List<String> nomesListagem(List<String> nomes, Character caracter) {

        List<String> nomesListagem = nomes.stream().filter(nome -> nome.startsWith(caracter.toString())).sorted().collect(Collectors.toList());
        return nomesListagem;
    }
}


