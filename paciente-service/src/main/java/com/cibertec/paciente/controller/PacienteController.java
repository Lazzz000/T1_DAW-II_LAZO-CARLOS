package com.cibertec.paciente.controller;

import com.cibertec.paciente.dto.PacienteDto;
import com.cibertec.paciente.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDto> obtenerPaciente(@PathVariable Long id) {
        PacienteDto paciente = pacienteService.obtenerPacientePorId(id);
        if (paciente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(paciente);
    }
}