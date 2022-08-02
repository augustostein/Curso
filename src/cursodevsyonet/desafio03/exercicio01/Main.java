package cursodevsyonet.desafio03.exercicio01;


import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws ParseException {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("DataNascimento(dd/mm/yyyy): ");
        String dataNascimento = teclado.nextLine();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);

        System.out.println(pessoa);


    }
}

