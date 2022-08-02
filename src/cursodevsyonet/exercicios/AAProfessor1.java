package cursodevsyonet.exercicios;

import java.util.List;

public class AAProfessor1 extends AAPessoa1 {
        private String formacao;
        private String sobrenome;
        private List<AAdisciplinas1> disciplinas;

        public AAProfessor1(String nome, List<AAdisciplinas1> disciplinas) {
                super(nome);
                this.disciplinas = disciplinas;
        }

        public String getFormacao() {
                return formacao;
        }

        public void setFormacao(String formacao){
                this.formacao = formacao;
        }
        public List<AAdisciplinas1> getDisciplinas() {
                return disciplinas;
        }

        public void setDisciplinas(List<AAdisciplinas1> disciplinas) {
                this.disciplinas = disciplinas;
        }

        public String getSobrenome(){
                return sobrenome;
        }

        public void setSobrenome(String sobrenome){
                this.sobrenome = sobrenome;
        }
}
