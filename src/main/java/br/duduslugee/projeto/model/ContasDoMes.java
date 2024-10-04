package br.duduslugee.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class ContasDoMes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao; // Removido o acento
    private Double valor;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataCadastro;

    private String formattedData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) { // Removido o acento
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getFormattedData() {
        return formattedData;
    }

    public void setFormattedData(String formattedData) {
        this.formattedData = formattedData;
    }
}
