package academy.devdojo.variaveis;

public class SalarioDoMes {
    public static void main(String [] args){
        float salarioMes = 2500.00F;
        float porcentagemSalario = 30L;
        double totalSalarioPorcentagem = salarioMes * (porcentagemSalario /100);
        double totalSalario = salarioMes - totalSalarioPorcentagem;
        System.out.println("O salário total é: " + totalSalario);
    }
}
