package com.gustavo.mportal.model;

public class Veiculo {

    private String placa;
    private String motorista;
    private int combustivel;

    public Veiculo(String placa ,int combustivel) {
        this.placa = placa;
        this.combustivel = combustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

}
