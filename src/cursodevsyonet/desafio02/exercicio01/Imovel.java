package cursodevsyonet.desafio02.exercicio01;

public class Imovel {

    private Double valorImovel;
    private Double areaImovel;

    public Imovel(Double valorVenda, Double areaImovel) {
        this.valorImovel = valorVenda;
        this.areaImovel = areaImovel;
    }

    public Double getValor() {
        return valorImovel;
    }

    public void setValor() {
        this.valorImovel = valorImovel;
    }

    public Double getAreaContruida() {
        return areaImovel;
    }

    public void setAreaContruida() {
        this.areaImovel = areaImovel;
    }

    @Override
    public String toString() {
        String teclado = String.valueOf(getValor());
        teclado = teclado.replaceAll("\\.", ",");
        String tela = " Área Imóvel " + areaImovel
                    + "\n Valor do Imóvel: R$" + teclado;
        return tela;
    }
}
