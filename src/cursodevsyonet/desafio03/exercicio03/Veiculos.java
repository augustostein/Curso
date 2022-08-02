package cursodevsyonet.desafio03.exercicio03;
/*Uma concessionário vende veículos novos e seminovos de carros, motos e caminhões. Todos os veículos são registrados com sua
qtd rodas, peso, cor, ano, marca, modelo, se é novo/seminovo e seu valor para venda além de outras informações específicas ao tipo de veículo.
Implemente o gerenciamento da lista de veículos da concessionária:
1. Inclusão de um novo veículo no estoque;
2. Atualização do preço de venda de um veículo;
3. Listagem dos carros onde o cliente pode definir se quer ver apenas novos, apenas seminovos ou ambos;
4. Listagem das motos por marca e cilindrada;
5. Listagem dos caminhões por tipo de carroceria: graneleiro, baú, baú frigorificado, plataforma, tanque e caçamba;
6. Venda de um veículo, onde clientes do tipo PCD possuem 50% de desconto, clientes do tipo agricultor possuem 40% e demais clientes sem desconto.*/

public class Veiculos {
    public Integer quantidadeRodas;
    public Double pesoVeiculo;
    public String cor;
    public Integer ano;
    public String marcaVeiculo;
    public String modeloVeiculo;
    public Double valorVendaVeiculo;
    public String novoUsado;

    public Veiculos(Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {
        this.quantidadeRodas = quantidadeRodas;
        this.pesoVeiculo = pesoVeiculo;
        this.cor = cor;
        this.ano = ano;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.novoUsado = novoUsado;
        this.valorVendaVeiculo = valorVendaVeiculo;
    }

    public String toString() {
        return "Marca: " + getMarcaVeiculo()
                + "\nModelo: " + getModeloVeiculo()
                + "\nPreço: " + getvalorVendaVeiculo() + "00 Mil Reais"
                + "\nAno: " + getAno()
                + "\nTipo de veículo: " + getNovoUsado()
                + "\nCor: " + getCor()
                + "\nPeso do veículo: " + getpesoVeiculo()
                + "\nQuantidade de rodas: " + getQuantidadeRodas()
                + "\nNovo/Usado: " + getNovoUsado();

    }


    public Integer getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public Double getpesoVeiculo() {
        return pesoVeiculo;
    }

    public void setpesoVeiculo(Double pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }


    public Double getvalorVendaVeiculo() {
        return valorVendaVeiculo;
    }

    public void setvalorVendaVeiculo(Double valorVendaVeiculo) {
        this.valorVendaVeiculo = valorVendaVeiculo;
    }

    public String getNovoUsado() {
        return novoUsado;
    }

    public void setNovoUsado() {
        this.novoUsado = novoUsado;
    }

}
