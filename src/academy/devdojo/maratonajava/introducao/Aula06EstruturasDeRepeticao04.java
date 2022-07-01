package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorDaParcela = valorTotal / parcela;
            if (valorDaParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+" de R$" + valorDaParcela);
        }
    }
}
