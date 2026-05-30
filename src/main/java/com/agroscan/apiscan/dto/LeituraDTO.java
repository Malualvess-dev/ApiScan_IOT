package com.agroscan.apiscan.dto;

public class LeituraDTO {

    private String categoria;
    private Double temperatura;
    private Double umidadeAr;
    private Integer umidadeSolo;

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public Double getTemperatura() { return temperatura; }
    public void setTemperatura(Double temperatura) { this.temperatura = temperatura; }

    public Double getUmidadeAr() { return umidadeAr; }
    public void setUmidadeAr(Double umidadeAr) { this.umidadeAr = umidadeAr; }

    public Integer getUmidadeSolo() { return umidadeSolo; }
    public void setUmidadeSolo(Integer umidadeSolo) { this.umidadeSolo = umidadeSolo; }
}