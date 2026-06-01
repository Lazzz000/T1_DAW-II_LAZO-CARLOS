package com.cibertec.cita.client;

import com.cibertec.cita.dto.PacienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "paciente-service")
public interface PacienteClient {
    
    @GetMapping("/api/pacientes/{id}")
    PacienteDto obtenerPacientePorId(@PathVariable("id") Long id);
}