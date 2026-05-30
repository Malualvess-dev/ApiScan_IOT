package com.agroscan.apiscan.service;


import com.agroscan.apiscan.dto.LeituraDTO;
import com.agroscan.apiscan.model.Leitura;
import com.agroscan.apiscan.repository.LeituraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeituraService {

    private final LeituraRepository repository;

    public LeituraService(LeituraRepository repository) {
        this.repository = repository;
    }

    public Leitura salvar(LeituraDTO dto) {

        com.agroscan.apiscan.model.Leitura leitura = new com.agroscan.apiscan.model.Leitura();

        leitura.setTemperatura(dto.getTemperatura());
        leitura.setUmidadeAr(dto.getUmidadeAr());
        leitura.setUmidadeSolo(dto.getUmidadeSolo());

        if(dto.getUmidadeSolo() < 30){
            leitura.setStatus("Solo seco");
        } else if(dto.getUmidadeSolo() <= 70){
            leitura.setStatus("Solo ideal");
        } else {
            leitura.setStatus("Solo muito úmido");
        }

        return repository.save(leitura);
    }

    public List<Leitura> listar() {
        return repository.findAll();
    }
}
