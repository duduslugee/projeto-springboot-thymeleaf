package br.duduslugee.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String modelo;
    private String marca;
    private Long anoModelo;
    private Long anoFabricacao;
    private String cor;
    private Double preco;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Long anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Long getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Long anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
