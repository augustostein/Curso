package cursodevsyonet.poo;

import java.util.List;

public class Professores extends Pessoa {

    private String nome;
    private String formação;
    private String disciplinas;

    public Professores(String nome, List<String> disciplinas) {
        super(nome);
       // this.disciplinas = disciplinas;

    }
}