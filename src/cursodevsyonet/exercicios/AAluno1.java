package cursodevsyonet.exercicios;

import java.util.ArrayList;
import java.util.List;

public class AAluno1 extends AAPessoa1 {
    private Integer idade;
    private List<AAdisciplinas1> disciplinas;


    public AAluno1(String nome) {
        super(nome);
        this.disciplinas = new ArrayList<>();

    }

    public Integer getidade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<AAdisciplinas1> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<AAdisciplinas1> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adicionaDisciplina(AAdisciplinas1 disciplina) {
        this.disciplinas.add(disciplina);
    }
    public String apresentaDados(){
        String disciplinas = "";

//        for (AAdisciplinas1: disciplinas : this.disciplinas) {
//            disciplinas += disciplina + " ";
//        }

        return super.apresentaDados() + "Idade " + this.getidade() +
                                        "Disciplinas " + this.getDisciplinas();
    }
}

