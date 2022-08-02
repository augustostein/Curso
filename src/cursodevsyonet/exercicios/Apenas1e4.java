package cursodevsyonet.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apenas1e4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        List<Integer> so1e4 = Arrays.asList(1, 4, 1, 4, 1, 4);
        System.out.println(valida(numeros));
        System.out.println(valida(so1e4));
    }

    static boolean valida(List<Integer> numeros) {
        for (Integer numero : numeros) {
            if (numero != 1 && numero != 4) {
                return false;
            }
        }
        return true;
    }
}
