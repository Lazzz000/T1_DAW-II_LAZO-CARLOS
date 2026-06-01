package com.cibertec.cita.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CitaResponse {
	
    private String estado;
    private String mensaje;
}