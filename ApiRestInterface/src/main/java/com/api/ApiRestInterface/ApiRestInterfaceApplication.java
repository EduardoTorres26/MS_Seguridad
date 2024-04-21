package com.api.ApiRestInterface; // Declara el paquete en el que se encuentra la clase

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Anotación que marca esta clase como una aplicación Spring Boot
public class ApiRestInterfaceApplication {

    public static void main(String[] args) {
        // Método principal de la aplicación
        SpringApplication.run(ApiRestInterfaceApplication.class, args);
        // Inicia la aplicación Spring Boot, pasando la clase principal y los argumentos del programa
    }

}

