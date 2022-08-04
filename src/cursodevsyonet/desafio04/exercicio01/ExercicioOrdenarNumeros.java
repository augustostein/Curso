package cursodevsyonet.desafio04.exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. Implemente um método que recebe uma lista de números e retorne eles ordenados.

public class ExercicioOrdenarNumeros {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(4, 2, 12, 5, 1, 6, 3, 7, 10, 8, 11, 9, 13, 15, 14);

        numeros.stream().sorted().collect(Collectors.toList()).forEach(numero -> System.out.print(numero + ", "));
        // numeros.stream().sorted().collect(Collectors.toList()).forEach(numero -> System.out.println(numero));

        // numeros.sort((a, b) -> a.compareTo(b));
        // System.out.println(numeros);
    }
}


