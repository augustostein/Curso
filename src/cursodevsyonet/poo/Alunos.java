package cursodevsyonet.poo;

import java.util.List;

public class Alunos extends Pessoa {

    private String nome;
    private Integer idade;
    private List<String> disciplinas;

    public Alunos(String nome) {
        super(nome);
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public List<String> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void adicionaDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }
}



