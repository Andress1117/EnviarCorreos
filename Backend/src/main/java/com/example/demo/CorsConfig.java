package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permitir solicitudes CORS desde todos los orígenes
        registry.addMapping("/**") // Permitir CORS para todas las rutas
                .allowedOrigins("http://localhost") // Permitir solicitudes desde localhost
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
                .allowedHeaders("*") // Todos los encabezados permitidos
                .allowCredentials(true); // Permitir credenciales (si es necesario)
    }
}
