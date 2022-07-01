package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
       int idade = 15;
       boolean isAutorizadoComprarBebida = idade >= 18;
       if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if (isAutorizadoComprarBebida == false) { // (mesma coisa, if (!isAutorizadoComprarBebida))
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.println("Não autorizado");
/*
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");

            apenas um exemplo do que se pode achar em certificações/exercicios
        } */
    }
}

