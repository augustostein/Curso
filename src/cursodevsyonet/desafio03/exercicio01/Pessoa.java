package cursodevsyonet.desafio03.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Integer idade;
    private Double altura;
    private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pessoa(String nome, String dataNascimento, Double altura) throws ParseException {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, sdf);
        calculaIdade(LocalDate.parse(dataNascimento, sdf));
        this.altura = altura;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataNascimento);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, sdf);
        calculaIdade(getDataNascimento());

    }

    public String toString() {
        return "\n" +
                "----Dados do(a) Usuário ----\n"
                + "Nome: " + getNome() + "\n"
                + "Data Nascimento: " + getDataNascimento().format(sdf) + "\n"
                + "Idade: " + getIdade() + " anos\n"
                + "Altura: " + getAltura();
    }

    public void calculaIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();

        if (dataAtual.getMonth().getValue() > dataNascimento.getMonthValue()) {
            this.idade = dataAtual.getYear() - dataNascimento.getYear();
            return;
        }
        if (dataAtual.getMonth().getValue() == dataNascimento.getMonthValue() && dataAtual.getDayOfMonth() >= dataNascimento.getDayOfMonth()) {
            this.idade = dataAtual.getYear() - dataNascimento.getYear();
        } else {
            this.idade = dataAtual.getYear() - dataNascimento.getYear() - 1;
        }
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

