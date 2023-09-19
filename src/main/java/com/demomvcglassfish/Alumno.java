package com.demomvcglassfish;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
    private String nombre;
    private int edad;

    private Nota nota;

    public Alumno() {
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, int edad, Nota nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
