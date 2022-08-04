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
            if (veiculo.getModeloVeiculo().equals(modelo)) {
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
                    if (veiculo.getNovoUsado().equals(tipoVeiculo)) {
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

    public void listaMarca(String marca) {
        for (Veiculos veiculo : veiculosLista) {
            if (veiculo.getMarcaVeiculo().equals(marca))
                System.out.println(veiculo);

        }
    }

    public void listaCilindradas(Integer cilindradas) {
        for (Veiculos veiculo : veiculosLista) {
            if (veiculo instanceof Motos) {
                Motos motoAtual = (Motos)veiculo;
                if (motoAtual.getCilindradas().equals(cilindradas)) {
                    System.out.println(motoAtual.toString());

                }
            }
        }
    }

    public void tiposDeCarrocerias(String tipoDeCarroceria) {
        for (Veiculos veiculo : veiculosLista) {
            if (veiculo instanceof Caminhoes) {
                Caminhoes caminhaoAtual = (Caminhoes) veiculo;
                if (caminhaoAtual.getTipoDeCarroceria().equals(tipoDeCarroceria)) {
                    System.out.println(caminhaoAtual);
                }

            }
        }
    }

    public void descondoPessoaPCD(String tipoCliente) {
        for (Veiculos veiculo : veiculosLista) {
            if (tipoCliente == "PCD") {
                System.out.println();
            }
        }
    }

}






