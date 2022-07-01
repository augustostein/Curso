package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
     //  System.out.println(calculadora.divideDoisNumeros(20,2));  mesma coisa da linha de cima
        double result1 = calculadora.divideDoisNumeros02(20,2);
        System.out.println("---------------------------------");
calculadora.imprimeDivisaoPorDoisNumeros(86, 5);

    }
}
