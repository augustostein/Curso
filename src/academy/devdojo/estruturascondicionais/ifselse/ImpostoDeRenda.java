package academy.devdojo.estruturascondicionais.ifselse;

public class ImpostoDeRenda {
    public static void main(String [] args){
        double salario = 21300;
        if (salario <= 1903.98) {
            System.out.println("O imposto para o seu salário é de ISENTO");
        } else if (salario >= 1909.99 && salario <= 2826.65) {
            System.out.println("O imposto para o seu salário de 7.5% e o valor é do imposto referente ao seu salário é de "+ (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05)
            System.out.println("O imposto para o seu salário de 15% e o valor é do imposto referente ao seu salário é de "+ (salario * 0.15));
        else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("O imposto para o seu salário de 22.5% e o valor é do imposto referente ao seu salário é de "+ (salario * 0.225));
        } else
            System.out.println("O imposto para o seu salário de 27.5% e o valor é do imposto referente ao seu salário é de "+ (salario * 0.27));
    }
}


