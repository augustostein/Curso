package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args){
        int[] idades = new int[3]; //  int[] idades <-(reference) = new int[3]; <-(objetos na memória), variável idade ta fazendo referencia a um objeto que é um array de três posições
       idades [0] = 21;
       idades [1] = 15;
       idades [2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }

}
