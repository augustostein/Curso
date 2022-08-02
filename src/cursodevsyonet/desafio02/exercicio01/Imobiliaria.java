package cursodevsyonet.desafio02.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    public static void main(String[] args){

        List<Imovel> imovelList = new ArrayList<>();

        Casa casa = new Casa(1500000D, 260D, 4, 510D);
        Apartamento apartamento = new Apartamento(165000D, 56D, 5, true);
        Terreno terreno = new Terreno(300000D, 150D);

        imovelList.add(casa);
        imovelList.add(apartamento);
        imovelList.add(terreno);

        for (Imovel imovel : imovelList) {
            System.out.println(imovel);
        }
    }
}
