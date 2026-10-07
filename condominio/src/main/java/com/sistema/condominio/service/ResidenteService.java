package com.sistema.condominio.service;

import com.sistema.condominio.dto.ResidenteDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidenteService {

    private List<ResidenteDTO> residentes = new ArrayList<>();

    public List<ResidenteDTO> obtenerTodosLosResidentes() {
        return residentes;
    }

    public ResidenteDTO registrarResidente(ResidenteDTO residenteDTO) {
        // En un caso real, aquí se llamaría a un repositorio para guardar en base de datos
        residenteDTO.setId((long) (residentes.size() + 1));
        residentes.add(residenteDTO);
        return residenteDTO;
    }
}

