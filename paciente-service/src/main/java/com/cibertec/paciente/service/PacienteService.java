package com.cibertec.paciente.service;

import com.cibertec.paciente.dto.PacienteDto;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class PacienteService {

    private final Map<Long, PacienteDto> baseDatosPacientes = new HashMap<>();

    public PacienteService() {
        //paciente 1:Totalmente apto
        baseDatosPacientes.put(1L, new PacienteDto(1L, "Carlos Miguel", "Ninguna", false, "ALTA"));
        //paciente 2:Riesgo cardiológico, requiere autorización para cirugía
        baseDatosPacientes.put(2L, new PacienteDto(2L, "Maria Lopez", "Penicilina", true, "ALTA"));
        //paciente 3:Tratamiento previo de ortodoncia sin terminar
        baseDatosPacientes.put(3L, new PacienteDto(3L, "Simon Choque", "Ninguna", false, "EN_CURSO"));
    }

    public PacienteDto obtenerPacientePorId(Long id) {
        return baseDatosPacientes.get(id); //retorna null si no existe
    }
}