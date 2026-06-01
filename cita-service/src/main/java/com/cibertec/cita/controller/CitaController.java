package com.cibertec.cita.controller;

import com.cibertec.cita.dto.CitaRequest;
import com.cibertec.cita.dto.CitaResponse;
import com.cibertec.cita.service.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/citas")
@RequiredArgsConstructor
public class CitaController {

    private final CitaService citaService;

    @PostMapping("/agendar")
    public ResponseEntity<CitaResponse> agendarCita(@RequestBody CitaRequest request) {
        CitaResponse response = citaService.agendarCita(request);
        return ResponseEntity.ok(response);
    }
}