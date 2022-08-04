package cursodevsyonet.desafio04.exercicio03;

// 3. Implemente um método que recebe uma lista de pessoas, que possuem nome sobrenome, data de nascimento e cidade, retorne as pessoas maiores de 18 anos.

import cursodevsyonet.desafio03.exercicio03.concecionaria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        CriaPessoas CriaPessoas = new CriaPessoas();

        CriaPessoas.adicionaPessoa("Augusto", "Stein", 26/01/1992, "Montenegro");
        CriaPessoas.adicionaPessoa("Matheus", "Oliveira", 10/11/1997, "Goiânia");
        CriaPessoas.adicionaPessoa("Helio", "Kuhn", 01/12/1992, "Montenegro");
        CriaPessoas.adicionaPessoa("Louise", "Ternes", 05/06/2000, "Montenegro");
        CriaPessoas.adicionaPessoa("Tiago", "Medeiros", 01/01/2015, "Montenegro");

        System.out.println();

    }
}
