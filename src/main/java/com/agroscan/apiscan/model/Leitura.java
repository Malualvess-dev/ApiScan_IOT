package com.agroscan.apiscan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_leitura")
public class Leitura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double temperatura;
    private Double umidadeAr;
    private Integer umidadeSolo;
    private String status;

    public Leitura() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getUmidadeAr() {
        return umidadeAr;
    }

    public void setUmidadeAr(Double umidadeAr) {
        this.umidadeAr = umidadeAr;
    }

    public Integer getUmidadeSolo() {
        return umidadeSolo;
    }

    public void setUmidadeSolo(Integer umidadeSolo) {
        this.umidadeSolo = umidadeSolo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
