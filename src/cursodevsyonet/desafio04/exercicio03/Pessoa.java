package cursodevsyonet.desafio04.exercicio03;

// 3. Implemente um método que recebe uma lista de pessoas, que possuem nome sobrenome, data de nascimento e cidade, retorne as pessoas maiores de 18 anos.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private Integer idade;
    private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String cidade;


    public Pessoa(String nome, String sobrenome, Integer dataNascimento, String cidade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cidade = cidade;

    }

    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nData de nascimento: " + idade
                + "\nCidade do infeliz: " + cidade + "\n";


    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, sdf);
        calculaIdade(this.dataNascimento);
    }

    public void calculaIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();

        if (dataAtual.getMonth().getValue() > dataNascimento.getMonthValue()) {
            this.idade = dataAtual.getYear() - dataNascimento.getYear();
            return;
        }
        if (dataAtual.getMonth().getValue() == dataNascimento.getMonthValue()
                && dataAtual.getDayOfMonth() >= dataNascimento.getDayOfMonth()) {
            this.idade = dataAtual.getYear() - dataNascimento.getYear();
        } else {
            this.idade = dataAtual.getYear() - dataNascimento.getYear() - 1;
        }
    }

    public static List<Pessoa> pessoasMaiorDeIdade(List<Pessoa> lista) {
        List<Pessoa> listaPessoasMaiores = lista.stream().filter(p -> p.idade >= 18)
                .collect(Collectors.toList());
        return listaPessoasMaiores;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer anoAtual) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
