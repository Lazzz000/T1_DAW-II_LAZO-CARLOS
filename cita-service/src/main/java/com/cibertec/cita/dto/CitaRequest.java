package com.cibertec.cita.dto;
import lombok.Data;

@Data
public class CitaRequest {
    private Long idPaciente;
    private String fecha;
    private String especialidad;//"Odontología General", "Cirugía Maxilofacial"
    private boolean esProcedimientoComplejo; //true si es extracción o cirugía
}