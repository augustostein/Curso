package academy.devdojo.estruturascondicionais.ifselse;/*
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
se não imprima 15% do valor
 */

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salarioMes = 4200.50F;
        double porcentagemSalario = salarioMes * 0.3;
        double porcentagemSalario2 = salarioMes * 0.1;
        if (salarioMes > 4500) {
            System.out.println("30% do salário é: " + porcentagemSalario);
        } else{
            System.out.println("15% do salário é: " + porcentagemSalario2);
        }
    }
}

/*
public class CalciladoraImpostComCondiciona {
    public static void main(String[] args) {
        float salario = 3700.50F;
        if (salario > 4500) {
            float trintaPorcentro = salario * 0.3F;
            System.out.println("30% = "+trintaPorcentro);
        } else {
            float dezPorCento = salario * 0.1F;
            System.out.println("10% = " + dezPorCento);
        }
    }
}

 */

/*
public class academy.devdojo.estruturascondicionais.ifselse.CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4200.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salarioMes > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else{
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O valor final da porcentagem de "+porcentagem"é de "+resultado);
    }
}
 */