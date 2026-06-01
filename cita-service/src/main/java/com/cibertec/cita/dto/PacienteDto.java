package com.cibertec.cita.dto;
import lombok.Data;

@Data
public class PacienteDto {
	
    private Long id;
    private String nombre;
    private String alergias;
    private boolean requiereAutorizacion;
    private String estadoTratamiento;
}