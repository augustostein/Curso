package academy.devdojo.logicadois;

public class CalculadoraImpostoComCondicional01 {
    public static void main (String[] args){
        float salario = 4500.00F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500.00){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println( porcentagem + " é igual a: " + resultado );
    }
}
