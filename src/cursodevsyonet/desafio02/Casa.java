package cursodevsyonet.desafio02;

public class Casa extends Imovel {

    private Integer numeroDeComodos;
    private Double areaTerreno;

    public Casa(Double valorVenda, Double areaImovel, Integer numeroDeComodos, Double areaTerreno) {
        super(valorVenda, areaImovel);
        this.numeroDeComodos = numeroDeComodos;
        this.areaTerreno = areaTerreno;

    }


    public Integer getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(Integer numeroDeComodos) {
        this.numeroDeComodos = numeroDeComodos;
    }

    public Double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(Double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public String toString() {


        return "\nCasa: \n" + super.toString()
                + "\n Número de Comodos: " + this.getNumeroDeComodos()
                + "\n Área do Terreno: " + this.getAreaTerreno();
    }
}


