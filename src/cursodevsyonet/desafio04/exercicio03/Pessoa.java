package cursodevsyonet.desafio04.exercicio03;

// 3. Implemente um método que recebe uma lista de pessoas, que possuem nome sobrenome, data de nascimento e cidade, retorne as pessoas maiores de 18 anos.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cidade;


    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String cidade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;

    }

    public Integer getIdade() {

        Integer idade = 0;
        LocalDate dataAtual = LocalDate.now();
        idade = Period.between(this.dataNascimento, dataAtual).getYears();
        return idade;
    }


    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nData de nascimento: " + dataNascimento
                + "\n" + getIdade() + " Anos"
                + "\nCidade do infeliz: " + cidade + "\n";


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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
