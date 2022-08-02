package cursodevsyonet.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiplo10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 10, 11, 20, 12);
        List<Integer> numeros2 = Arrays.asList(5, 9, 10, 15, 20, 15);
        String resultado = "";

        for (Integer numero : iteraMultiplos10(numeros)) {
            resultado = resultado + ", " + numero;
        }
        System.out.println("Resultado 1: "+ resultado);

        resultado = "";
        for (Integer numero : iteraMultiplos10(numeros2)) {
            resultado = resultado + ", " + numero;
        }
        System.out.println("Resultadp 2: "+ resultado);
    }

    static List<Integer> iteraMultiplos10(List<Integer> numeros) {
        int multiplo = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 10 == 0) {
                multiplo = numeros.get(i);
            } else if (multiplo != 0) {
                numeros.set(i, multiplo);
            }
        }
        return numeros;
    }
}

