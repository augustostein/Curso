package cursodevsyonet.desafio02;

public class Apartamento extends Imovel {
    private Integer numeroDeComodos;
    private Boolean possuiSalaoDeFestas;

    public Apartamento(Double valorVenda, Double areaImovel, Integer numeroDeComodos, Boolean possuiSalaoDeFestas) {
        super(valorVenda, areaImovel);
        this.numeroDeComodos = numeroDeComodos;
        this.possuiSalaoDeFestas = possuiSalaoDeFestas;

    }

    public Integer getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(Integer numeroDeComodos) {
        this.numeroDeComodos = numeroDeComodos;
    }

    public Boolean isPossuiSalaoDeFestas() {
        return possuiSalaoDeFestas;
    }

    public void setPossuiSalaoDeFestas(Boolean possuiSalaoDeFestas) {
        this.possuiSalaoDeFestas = possuiSalaoDeFestas;
    }

    @Override
    public String toString() {

        String salaoDeFestas = "";

        if (this.isPossuiSalaoDeFestas()) {
            salaoDeFestas = "Sim";
        } else {
            salaoDeFestas = "Não";
        }
        return "\nApartamento: \n" + super.toString()
                + "\n Número de Comodos: " + this.getNumeroDeComodos()
                + "\n Possui Salão de festas: " + salaoDeFestas;
    }
}
