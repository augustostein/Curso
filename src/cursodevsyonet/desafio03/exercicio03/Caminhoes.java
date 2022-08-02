package cursodevsyonet.desafio03.exercicio03;

public class Caminhoes extends Veiculos {

    private String tipoDeCarroceria;
    private Integer quantidadeEixo;

    public Caminhoes(String tipoDeCarroceria, Integer quantidadeEixo, Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String tipoVeiculo, Double valorVendaVeiculo) {
        super(quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, tipoVeiculo, valorVendaVeiculo);
        this.tipoDeCarroceria = tipoDeCarroceria;
        this.quantidadeEixo = quantidadeEixo;
    }

    public String getTipoDeCarroceria() {
        return tipoDeCarroceria;
    }

    public void setTipoDeCarroceria(String tipoDeCarroceria) {
        this.tipoDeCarroceria = tipoDeCarroceria;
    }

    public Integer getQuantidadeEixo() {
        return quantidadeEixo;
    }

    public void setQuantidadeEixo(Integer quantidadeEixo) {
        this.quantidadeEixo = quantidadeEixo;
    }

    @Override
    public String toString() {
        return "\n---- Caminhão ----: \n\n"
                + super.toString()

                + "\nTipo de carroceria: " + getTipoDeCarroceria()
                + "\nQuantidade de eixo: " + getQuantidadeEixo();
//                + "\nQuantidade de Rodas: " + getQuantidadeRodas()
//                + "\nPeso: " + getpesoVeiculo()
//                + "\nCor: " + getCor()
//                + "\nAno: " + getAno()
//                + "\nMarca: " + getMarcaVeiculo()
//                + "\nModelo: " + getModeloVeiculo()
//                + "\nTipo: " + getNovoUsado()
//                + "\nValor de venda: " + getvalorVendaVeiculo() + "\n";
    }
}
