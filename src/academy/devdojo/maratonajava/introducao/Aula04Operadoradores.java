package academy.devdojo.maratonajava.introducao;

public class Aula04Operadoradores{
    public static void main(String[] args){
      // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01*numero02;
        System.out.println(resultado);
  // % resto,
  int resto = 21 % 7;
        System.out.println(resto);

        // < menor, > maior, <=, >=, == igual, != diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQuevinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean iSDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 == 20;

        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQuevinte "+ isDezMenorQuevinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);
        System.out.println("iSDezIgualDez "+ iSDezIgualDez);
        System.out.println("isDezDiferenteDeDez "+ isDezDiferenteDeDez);

   // && and, || or, ! not

        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 20;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationConcoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationConcoCompravel "+ isPlaystationConcoCompravel);

        // = += -+ *= /= %=

        double bonus = 1800;
        bonus += 1000; // é a mesma coisa que bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2
        bonus %= 2; // bonus = bonus % 2
        System.out.println(bonus);

        //

        int contador =  0;
        contador++; // contador = contador +1
        contador--; // contador = contador -1
        ++contador; // contador = 1 + contador
        --contador; // contador = 1 - contador

    }
}
