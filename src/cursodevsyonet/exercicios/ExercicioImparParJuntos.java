package cursodevsyonet.exercicios;


public class ExercicioImparParJuntos {
    public static void main(String[] args) {

        System.out.println(somaPares(8));
        System.out.println (somaImpares(8));
    }

    static int somaPares(int numeroMaximo) {
        int soma = 0;
        int i = 0;

        while (i <= numeroMaximo) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        return soma;
    }

    static int somaImpares(int numeroMaximo) {
        int soma = 0;

        for (int i = 0; i < numeroMaximo; i ++){
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }
}