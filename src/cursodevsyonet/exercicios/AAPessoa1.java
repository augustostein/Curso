package cursodevsyonet.exercicios;

public class AAPessoa1 {

    private String nome;
    private String sobrenome;

    public AAPessoa1(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
public String getSobrenome(){
        return sobrenome;
}
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String apresentaDados(){
        return this.nome + " " + this.sobrenome;
}
}