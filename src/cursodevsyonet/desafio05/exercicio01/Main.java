package cursodevsyonet.desafio05.exercicio01;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static cursodevsyonet.desafio05.exercicio01.VeiculoBuild.veiculosLista;

public class Main {
    public static void main(String[] args) {


        VeiculoBuild VeiculoBuild = new VeiculoBuild();

        VeiculoBuild.adicionaVeiculo("VW", "Up", "ixi6969", "8ds8k14ys721dqsq7", 70.000);
        VeiculoBuild.adicionaVeiculo("VW", "Up", "IFJ2211", "6A2AAM569Jy9T0423", 54.000);
        VeiculoBuild.adicionaVeiculo("VW", "Gol", "IFJ8641", "1jhCtzBvm5su01262", 60.000);
        VeiculoBuild.adicionaVeiculo("VW", "Gol", "IFJ5791", "7uN7fu7UsvyDu3205", 61.000);
        VeiculoBuild.adicionaVeiculo("VW", "Gol", "IFJ3311", "614KShAfEGUsy0509", 58.000);
        VeiculoBuild.adicionaVeiculo("GM", "S10", "IFJ9800", "2k46p4d1jA33K2923", 130.000);
        VeiculoBuild.adicionaVeiculo("GM", "Onix", "IFJ0107", "4JFt885bWcAUA6251", 66.000);
        VeiculoBuild.adicionaVeiculo("GM", "Onix", "IFJ8106", "8LU1D46l6m4a50144", 63.000);
        VeiculoBuild.adicionaVeiculo("Ford", "Fiesta", "IFJ3701", "3xa63amHD3Dr64331", 56.000);
        VeiculoBuild.adicionaVeiculo("Ford", "Focus", "IFJ0912", "5vAA8Aaf4C66Y1871", 80.000);


//        1. Dado um veículo com características como: (Marca, modelo, placa, chassi, valor), crie métodos que identifiquem se:
//           Todos são da marca VW.
//           Nenhum é modelo GOL.
//           Algum é modelo JETTA.

        VeiculoBuild.listaVeiculosMarca("VW");

        VeiculoBuild.listaModeloVeiculo("Gol");

//-----------------------------------------------------------------------------------

//        2. Utilizando o mesmo exemplo acima, crie um método que irá retornar a soma de todos os veículos da listagem criada anteriormente.

        VeiculoBuild.somaValoresVeiculos();

//-----------------------------------------------------------------------------------

//        3. Crie um método que altere os veículos da lista setando todos com placa = "ABC1234".

        VeiculoBuild.ajustaPlacaVeiculos("ABC1234");

//-----------------------------------------------------------------------------------

//        4. Crie um método que duplique os veículos da lista.

        System.out.println(VeiculoBuild.listaDuplicada(veiculosLista));

//-----------------------------------------------------------------------------------

//        5. Crie um método que retorne a lista de placa dos veículos.

        VeiculoBuild.listaPlacas();

//-----------------------------------------------------------------------------------

//        6. Crie um método que ordene a listagem de veículos por valor, do maior ao menor.

        VeiculoBuild.ordenaPrecoVeiculos();

    }
}

