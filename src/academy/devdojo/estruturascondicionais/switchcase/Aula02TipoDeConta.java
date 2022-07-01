package academy.devdojo.estruturascondicionais.switchcase;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "investimento";
        switch (conta) {
            case ("CONTA_POUPANCA"):
                System.out.println("A porcentagem da conta POUPANÇA é de 0.05%");
                break;
            case ("CONTA_CORRENTE"):
                System.out.println("A porcecntagem da conta CORRENTE é de 0.02%");
                break;
            case ("CONTA_INVESTIMENTO"):
                System.out.println("A porcentagem da conta INVESTIMENTO é de 0.1%");
                break;
            default:
                System.out.print("Conta inválida");
        }
    }
}
