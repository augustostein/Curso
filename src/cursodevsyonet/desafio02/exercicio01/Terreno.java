package cursodevsyonet.desafio02.exercicio01;

public class Terreno extends Imovel {

    public Terreno(Double valorVenda, Double areaImovel) {
        super(valorVenda, areaImovel);
    }

    @Override
    public String toString() {
        return "\nTerreno: \n" + super.toString();
    }
}