package com.demomvcglassfish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Alumno alumno(){
        return new Alumno();
    }

    @Bean
    public GestorCursosServices servicio(){
        return new GestorCursosServices();
    }

    @Bean
    public AlumnoRepository repoAlumno(){
        return new AlumnoRepository();
    }

}
