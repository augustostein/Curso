package cursodevsyonet;

public class Exercicio01 {

        public static void main(String[] args) {
            double gastosMesJaneiro = 15000;
            double gastosMesFevereiro = 23000;
            double gastosMesMarco = 17000;
            double totalTrimestre = gastosMesJaneiro + gastosMesFevereiro + gastosMesMarco;
            double mediaTrimestre = totalTrimestre / 3;

            System.out.println("A soma total do trimestre é de: R$" + totalTrimestre);
            System.out.println("A média mensal da empresa é de: R$" + mediaTrimestre);

        }
    }

