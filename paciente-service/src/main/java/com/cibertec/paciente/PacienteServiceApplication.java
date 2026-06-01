package com.cibertec.paciente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//se registra en Eureka
public class PacienteServiceApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(PacienteServiceApplication.class, args);
    }
    
}