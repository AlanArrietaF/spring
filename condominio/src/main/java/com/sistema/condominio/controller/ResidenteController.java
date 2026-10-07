package com.sistema.condominio.controller;

import com.sistema.condominio.dto.ResidenteDTO;
import com.sistema.condominio.service.ResidenteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/residentes")
public class ResidenteController {

    private final ResidenteService residenteService;

    public ResidenteController(ResidenteService residenteService) {
        this.residenteService = residenteService;
    }

    @GetMapping
    public List<ResidenteDTO> listar() {
        return residenteService.obtenerTodosLosResidentes();
    }

    @PostMapping
    public ResidenteDTO crear(@RequestBody ResidenteDTO residenteDTO) {
        return residenteService.registrarResidente(residenteDTO);
    }
}
