package academy.devdojo.variaveis;

public class TestandoVariaveis {
    public static void main(String [] args){
        float salario = 5000.00F;
        float variavelSalario = 30L;
        float variavelSalarioDois = 15L;
        float variavelSalarioTres = 5L;
        double totalSalarioDesc = salario * (variavelSalario /100);
        double totalSalarioDescDois = salario * (variavelSalarioDois /100);
        double totalSalarioDescTres = salario * (variavelSalarioTres /100);
        System.out.println("30% do salário é: "+ totalSalarioDesc);

        System.out.println("15% do salário é: "+ totalSalarioDescDois);

        System.out.println("5% do salário é: "+ totalSalarioDescTres);
    }
}
