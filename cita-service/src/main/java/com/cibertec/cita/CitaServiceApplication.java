package com.cibertec.cita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//esto habilita el escaneo de interfaces Feign
public class CitaServiceApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(CitaServiceApplication.class, args);
    }
    
}