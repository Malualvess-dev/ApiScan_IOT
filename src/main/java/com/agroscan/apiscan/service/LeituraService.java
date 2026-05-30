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
        Leitura leitura = new Leitura();

        leitura.setCategoria(dto.getCategoria());
        leitura.setTemperatura(dto.getTemperatura());
        leitura.setUmidadeAr(dto.getUmidadeAr());
        leitura.setUmidadeSolo(dto.getUmidadeSolo());
        leitura.setStatus(classificarStatus(dto));

        return repository.save(leitura);
    }

    public List<Leitura> listar() {
        return repository.findAll();
    }

    public Leitura buscarUltimaLeitura() {
        return repository.findAll()
                .stream()
                .reduce((primeira, ultima) -> ultima)
                .orElse(null);
    }

    private String classificarStatus(LeituraDTO dto) {
        String categoria = dto.getCategoria();
        Integer umidadeSolo = dto.getUmidadeSolo();
        Double temperatura = dto.getTemperatura();

        if (categoria == null) {
            categoria = "Solo";
        }

        if (categoria.equalsIgnoreCase("Solo")) {
            if (umidadeSolo < 30) {
                return "Solo seco";
            } else if (umidadeSolo <= 70) {
                return "Solo ideal";
            } else {
                return "Solo muito úmido";
            }
        }

        if (categoria.equalsIgnoreCase("Planta") || categoria.equalsIgnoreCase("Verdura")) {
            if (umidadeSolo < 30) {
                return "Precisa de água";
            } else if (temperatura > 35) {
                return "Muito quente";
            } else {
                return "Saudável";
            }
        }

        if (categoria.equalsIgnoreCase("Fruta") || categoria.equalsIgnoreCase("Legume")) {
            if (temperatura > 35) {
                return "Risco de deterioração";
            } else {
                return "Boa condição";
            }
        }

        return "Analisado";
    }
}
