package academy.devdojo.logicadois;

public class ArraysAula01IntroducaoArrays {
    public static void main(String[] args){
        double[] notas = new double [5];

        notas[0] = 22;
        notas[1] = 12;
        notas[2] = 7;
        notas[3] = 2;
        notas[4] = 17;

        double somaNotas = notas[0] +notas[1] + notas[2] + notas[3] + notas[4];


        System.out.println("Nota 1: " + notas[0]);
        System.out.println("Nota 2: " + notas[1]);
        System.out.println("Nota 3: " + notas[2]);
        System.out.println("Nota 4: " + notas[3]);
        System.out.println("Nota 5: " + notas[4]);
        System.out.println("A soma das notas é: "+ somaNotas);

        for (int i = 0; i < 5 /* == notas.length */; i++)
            System.out.println("Tamando do array: " + notas[i] /* == + notas.length*/);
    }
}

