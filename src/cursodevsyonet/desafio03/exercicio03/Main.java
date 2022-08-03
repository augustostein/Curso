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

        concecionaria.adicionaMoto(600, 2, 620., "Preta", 2022, "Honda", "Hornet", "Novo", 40.000);
        concecionaria.adicionaMoto(700, 2, 520., "Branca", 2022, "Yamaha", "MT-07", "Usado", 40.000);
        concecionaria.adicionaMoto(975, 2, 650., "Azul", 2022, "Yamaha", "MT-09", "Novo", 59.000);

        concecionaria.adicionaCaminhao("Graneleiro", 8, 20, 15000., "Verde", 2020, "VN", "Numsei", "Usado", 14.000);
        concecionaria.adicionaCaminhao("Graneleiro", 5, 24, 52000., "Azul", 2022, "VN", "Numsei", "Novo", 20.000);
        concecionaria.adicionaCaminhao("Baú", 2, 32, 4000., "Rosa", 2020, "VN", "Numsei", "Usado", 52.000);
        concecionaria.adicionaCaminhao("Baú", 3, 44, 12000., "Verde", 2022, "VN", "Numsei", "Novo", 123.000);
        concecionaria.adicionaCaminhao("Baú frigorificado", 123, 24, 912000., "Branco", 2020, "VN", "Numsei", "Usado", 21.000);
        concecionaria.adicionaCaminhao("Baú frigorificado", 32, 24, 112000., "Amarelo", 2022, "VN", "Numsei", "Novo", 62.000);
        concecionaria.adicionaCaminhao("Plataforma", 7, 551, 12000., "Branco", 2020, "VN", "Numsei", "Usado", 52.000);
        concecionaria.adicionaCaminhao("Plataforma", 15, 2124, 18000., "Preto", 2022, "VN", "Numsei", "Novo", 10.000);
        concecionaria.adicionaCaminhao("Tanque", 22, 86, 655000., "Verde", 2020, "VN", "Numsei", "Usado", 73.000);
        concecionaria.adicionaCaminhao("Tanque", 34, 12, 85000., "Preto", 2022, "VN", "Numsei", "Novo", 51.000);
        concecionaria.adicionaCaminhao("Caçamba", 742, 14, 25000., "Azul", 2020, "VN", "Numsei", "Usado", 730.000);
        concecionaria.adicionaCaminhao("Caçamba", 12, 1, 35000., "Azul", 2022, "VN", "Numsei", "Novo", 90.000);


        concecionaria.alteraPreço("Gol", 75.000);

        concecionaria.listaNovosUsadosAmbos("Novo");
        concecionaria.listaNovosUsadosAmbos("Usado");
        concecionaria.listaNovosUsadosAmbos("Ambos");

        System.out.println("------------------------------------");

        concecionaria.listaMarca("Yamaha");
        concecionaria.listaCilindradas(600, "Honda");

        concecionaria.tiposDeCarrocerias("Baú frigorificado");

    }
}
