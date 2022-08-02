package cursodevsyonet.exercicios;

public class ValidacaoNumerosPrimos {
    public static void main(String[] args) {
        System.out.println(verificaPirmo(1));
        System.out.println(verificaPirmo(7));
        System.out.println(verificaPirmo(10));
    }

    static boolean verificaPirmo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
