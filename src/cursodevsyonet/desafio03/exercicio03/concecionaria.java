package cursodevsyonet.desafio03.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class concecionaria {

    List<Veiculos> veiculosLista = new ArrayList<>();

    public void adicionaCarro(Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {

        Carros carros = new Carros(quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, novoUsado, valorVendaVeiculo);

        veiculosLista.add(carros);

    }

    public void adicionaCaminhao(String tipoDeCarroceria, Integer quantidadeEixo, Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {

        Caminhoes caminhoes = new Caminhoes(tipoDeCarroceria, quantidadeEixo, quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, novoUsado, valorVendaVeiculo);

        veiculosLista.add(caminhoes);

    }

    public void adicionaMoto(Integer cilindradas, Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {

        Motos motos = new Motos(cilindradas, quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, novoUsado, valorVendaVeiculo);

        veiculosLista.add(motos);
    }

    public void alteraPreço(String modelo, Double preco) {

        for (Veiculos veiculo : veiculosLista) {
            if (veiculo.getModeloVeiculo() == modelo) {
                veiculo.setvalorVendaVeiculo(preco);
            }
        }
    }

    public void listaTodosCarro() {
        for (Veiculos veiculo : veiculosLista) {
            System.out.println(veiculo);

        }
    }

    public void listaNovosUsadosAmbos(String tipoVeiculo) {
        switch (tipoVeiculo) {
            case "Novo":

            case "Usado":

                for (Veiculos veiculo : veiculosLista) {
                    if (veiculo.getNovoUsado() == tipoVeiculo) {
                        System.out.println(veiculo);

                    }
                }
                break;

            case "Ambos":
                for (Veiculos veiculo : veiculosLista) {
                    System.out.println(veiculo);

                }
                break;
        }
    }
}






