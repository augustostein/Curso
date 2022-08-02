package cursodevsyonet.desafio03.exercicio03;

public class Motos extends Veiculos {

    private Integer cilindradas;

    public Motos(Integer cilindradas, Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {
        super(quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, novoUsado, valorVendaVeiculo);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "\n---- Motos ---- \n\n"
                + super.toString()

                + "\nCilindradas: " + getCilindradas();
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
