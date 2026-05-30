package com.agroscan.apiscan.controller;




import com.agroscan.apiscan.dto.LeituraDTO;
import com.agroscan.apiscan.model.Leitura;
import com.agroscan.apiscan.service.LeituraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scanner")
public class LeituraController {

    private final LeituraService service;

    public LeituraController(LeituraService service) {
        this.service = service;
    }

    @PostMapping("/dados")
    public Leitura salvar(@RequestBody LeituraDTO dto){
        return service.salvar(dto);
    }

    @GetMapping("/historico")
    public List<Leitura> listar(){
        return service.listar();
    }

    @GetMapping("/status")
    public Leitura statusAtual() {
        return service.buscarUltimaLeitura();
    }
}
