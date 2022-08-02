package cursodevsyonet.desafio03.exercicio03;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
import cursodevsyonet.desafio02.exercicio01.Imovel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        concecionaria concecionaria = new concecionaria();

        concecionaria.adicionaCarro(4, 520., "Branco", 2008, "VW", "Passat", "Usado", 120.000);
        concecionaria.adicionaCarro(4, 570., "Verde", 2022, "VW", "Gol", "Novo", 60.000);
        concecionaria.adicionaCarro(4, 600., "Azul", 2002, "VW", "Up", "Usado", 55.000);
        concecionaria.adicionaCarro(4, 1002., "Rosa", 2022, "VW", "Tiguan", "Novo", 160.000);


        //concecionaria.alteraPreço("Gol", 75.000);

        concecionaria.listaNovosUsadosAmbos("Novo");

    }
}
