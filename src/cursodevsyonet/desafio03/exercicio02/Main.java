package cursodevsyonet.desafio03.exercicio02;

public class Main {

    public static void main(String[] args) {

        Elevador elevador = new ElevadorImpl();
        elevador.inicializa(5, 10);
        elevador.entra();
        elevador.sai();
        elevador.sai();

    }

}
