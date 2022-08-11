package cursodevsyonet.desafio04.exercicio03;

// 3. Implemente um método que recebe uma lista de pessoas, que possuem nome sobrenome, data de nascimento e cidade, retorne as pessoas maiores de 18 anos.

import cursodevsyonet.desafio03.exercicio03.concecionaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(

                new Pessoa("Augusto", "Stein", LocalDate.of(1992, 01, 26), "Montenegro"),
                new Pessoa("Matheus", "Oliveira", LocalDate.of(1982, 01, 26), "Goiânia"),
                new Pessoa("Helio", "Kuhn", LocalDate.of(1992, 01, 26), "Montenegro"),
                new Pessoa("Louise", "Ternes", LocalDate.of(2000, 05, 06), "Montenegro"),
                new Pessoa("Tiago", "Medeiros", LocalDate.of(2015, 02, 01), "Montenegro")
        );

        //pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).map()

        pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).forEach(pessoa -> System.out.println(pessoa.toString()));


        // transformar em um for normal em uma stream
        // transformar uma stream em for normal

    }
}

