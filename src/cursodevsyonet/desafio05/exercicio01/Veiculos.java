package cursodevsyonet.desafio05.exercicio01;


//1. Dado um veículo com características como: (Marca, modelo, placa, chassi, valor), crie métodos que identifiquem se:
//- Todos são da marca VW.
//- Nenhum é modelo GOL.
//- Algum é modelo JETTA.

import cursodevsyonet.desafio03.exercicio03.Carros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Collectors;

public class Veiculos {

    private String marca;
    private String modelo;
    private String placa;
    private String chassi;
    private Double valor;

    public Veiculos( String marca, String modelo, String placa, String chassi, Double valor){
        this.marca = marca;
        this.modelo = modelo;
        this. placa = placa;
        this.chassi = chassi;
        this.valor = valor;
    }

    public String toString() {
        return //"\nVeiculo: \n" +
                "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nPlaca: " + getPlaca()
                + "\nChassi: " + getChassi()
                + "\nValor: " + getValor();
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public Double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }

}
