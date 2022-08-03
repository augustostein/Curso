package cursodevsyonet.desafio03.exercicio03;

public class Carros extends Veiculos {

    public Carros(Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String tipoVeiculo, Double valorVendaVeiculo) {
        super(quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, tipoVeiculo, valorVendaVeiculo);
    }

    @Override
    public String toString() {
        return "\n---- Carro ---- \n\n"
                + super.toString();
//
//                + "\nQuantidade de Rodas: " + getQuantidadeRodas()
//                + "\nPeso: " + getpesoVeiculo()
//                + "\nCor: " + getCor()
//                + "\nAno: " + getAno()
//                + "\nMarca: " + getMarcaVeiculo()
//                + "\nModelo: " + getModeloVeiculo()
//                + "\nTipo: " + getNovoUsado()
//                + "\nValor de venda: " + getvalorVendaVeiculo()  + "00 Mil Reais" + "\n";

    }
}
