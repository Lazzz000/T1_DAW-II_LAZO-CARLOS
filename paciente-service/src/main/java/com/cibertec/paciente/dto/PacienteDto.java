package com.cibertec.paciente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDto {
	
    private Long id;
    private String nombre;
    private String alergias;
    private boolean requiereAutorizacion;
    private String estadoTratamiento; //"ALTA", "EN_CURSO", "OBSERVACION"
}
