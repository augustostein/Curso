package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
//Annual taxable income (gross)	Total rate
//€ 0 - 34.712	9,70%
//€ 34.713 - 68.507	37,35%
//€ 68.508+	49,50%
        //        String salarioComTaxas = salarioMes <= 20.711 ? "As taxas para seu salário são de: 36,65%" : salarioMes >= 20.712 && <= 68.507 ?
//        Scanner salario = new Scanner(System.in);
//        System.out.println("Digite o seu salário: ");
//        int salarioMes = salario.nextInt();
//        if (salarioMes <= 20711) {
//            System.out.println("9,70% de taxa, o total de desconto é" + (salarioMes * 0.0970));
//        } else if (salarioMes >= 20712 && salarioMes <= 68507) {
//            System.out.println("37,35% de taxa, o total de desconto é " + (salarioMes * 0.3735));
//        } else
//            System.out.println("49,50% de taxa, o total de desconto é " + (salarioMes * 0.4950));
//    }
//}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        double salarioAnual = scanner.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundairaFaixa = 38.10 / 100;
        double terceiraFaixa = 36.65 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
            // salarioAnual = salarioAnual * primeiraFaixa; // salarioAnual *= primeiraFaixa
        } else if (salarioAnual >= 34713 && salarioAnual <= 68) {
            valorImposto = salarioAnual * segundairaFaixa;
            // salarioAnual = salarioAnual * segundairaFaixa; // salarioAnual *= segundaFaixa
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
            //salarioAnual = salarioAnual * terceiraFaixa; // salarioAnual *= terceiraFaixa
        }
        System.out.println(valorImposto);
    }
}