package com.cibertec.cita.service;

import com.cibertec.cita.client.PacienteClient;
import com.cibertec.cita.dto.CitaRequest;
import com.cibertec.cita.dto.CitaResponse;
import com.cibertec.cita.dto.PacienteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CitaService {

    private final PacienteClient pacienteClient;

    public CitaResponse agendarCita(CitaRequest request) {
        try {
            //comunicación sincrónica, consulto el historial del paciente vía Feign
            PacienteDto paciente = pacienteClient.obtenerPacientePorId(request.getIdPaciente());

            //reglas de negocio
            if (request.isEsProcedimientoComplejo()) {
                if (paciente.isRequiereAutorizacion()) {
                    return new CitaResponse("RECHAZADA", 
                        "El paciente " + paciente.getNombre() + " requiere autorización médica previa por riesgo.");
                }
                if (!"ALTA".equals(paciente.getEstadoTratamiento())) {
                    return new CitaResponse("RECHAZADA", 
                        "El paciente " + paciente.getNombre() + " tiene un tratamiento en curso. No apto para cirugía.");
                }
            }

            //si pasa todas las validaciones
            return new CitaResponse("APROBADA", 
                "Cita agendada exitosamente para " + paciente.getNombre() + ". Alergias a tener en cuenta: " + paciente.getAlergias());

        } catch (Exception e) {
            //manejo basico de errores
            return new CitaResponse("ERROR", "No se pudo validar el historial del paciente. Detalle: " + e.getMessage());
        }
    }
}