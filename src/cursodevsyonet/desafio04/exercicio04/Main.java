package cursodevsyonet.desafio04.exercicio04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Veiculos> veiculos = new ArrayList<>();

        Veiculos veiculos1 = new Veiculos("VW", "Golf", "4F38p47NdTk387452");
        Veiculos veiculos2 = new Veiculos("Ford", "Focus", "");
        Veiculos veiculos3 = new Veiculos("GM", "Onix", "2TgdA8SKYVU4u9620");
        Veiculos veiculos4 = new Veiculos("VW", "UP", " ");
        Veiculos veiculos5 = new Veiculos("Fiat", "Uno", "3zu7e10edjnh30361");

        veiculos.add(veiculos1);
        veiculos.add(veiculos2);
        veiculos.add(veiculos3);
        veiculos.add(veiculos4);
        veiculos.add(veiculos5);


        for (Veiculos veiculo : veiculos){
            if(veiculo.getChassiVeiculo() != "");
        }

    }
}
