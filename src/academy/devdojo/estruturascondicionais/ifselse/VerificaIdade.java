package academy.devdojo.estruturascondicionais.ifselse;

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 12;
        // == (igual), != (diferente), > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
    }
}

