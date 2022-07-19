package cursodevsyonet.desafio01;

public class Exercicio01 {

    public static void main(String[] args) {
//            double gastosMesJaneiro = 15000;
//            double gastosMesFevereiro = 23000;
//            double gastosMesMarco = 17000;
//            double totalTrimestre = gastosMesJaneiro + gastosMesFevereiro + gastosMesMarco;
//            double mediaTrimestre = totalTrimestre / 3;
//
//            System.out.println("A soma total do trimestre é de: R$" + totalTrimestre);
//            System.out.println("A média mensal da empresa é de: R$" + mediaTrimestre);
//
//        }
//    }

//SOLUÇÃO 01 -- Betina

        int gastos[] = {15000, 23000, 17000};
        int total = 0;
        for (int gasto : gastos) {
            total += gasto;
        }
        int media = total / gastos.length;
        System.out.println("Total " + total);
        System.out.println("Média " + media);
    }
}



