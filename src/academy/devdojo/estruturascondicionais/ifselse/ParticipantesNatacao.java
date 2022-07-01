package academy.devdojo.estruturascondicionais.ifselse;

public class ParticipantesNatacao {
    public static void main(String[] args){
        String nome = "Augusto";
        int idade = 5;
        if (idade < 11) {
            System.out.println(nome+" paticipará da categoria infantil");
        }else if  (idade >= 11 && idade <= 15) {
            System.out.println(nome+" participará da categoria juvenil");
        }else if (idade >= 17 && idade <= 19){
            System.out.println(nome+" participará da categoria pré-adulto");
        } else {
                System.out.println(nome+" participará da categoria adulto");
        }
    }
}
