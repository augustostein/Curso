package cursodevsyonet.desafio04.exercicio04;

public class Veiculos {
    public String marcaVeiculo;
    public String modeloVeiculo;
    public String chassiVeiculo;


    public Veiculos(String marcaVeiculo, String modeloVeiculo, String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
    }

    public String toString() {
        return "Marca: " + getMarcaVeiculo()
                + "\nModelo: " + getModeloVeiculo()
                + "\nChassi: " + getChassiVeiculo();

    }

    public String getChassiVeiculo() {
        return chassiVeiculo;
    }

    public void setChassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

}