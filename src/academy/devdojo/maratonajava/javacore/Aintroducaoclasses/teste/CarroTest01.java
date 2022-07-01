package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args){
       Carro carro = new Carro();
       Carro carro1 = new Carro();

       carro.marca = "Volwkswagem";
       carro.modelo = "Golf GTI";
       carro.ano = 2022;

       carro1.marca = "Mustang";
       carro1.modelo = "GT 500";
       carro1.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
    }
}

