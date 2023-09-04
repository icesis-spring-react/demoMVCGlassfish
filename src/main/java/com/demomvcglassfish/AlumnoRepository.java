package com.demomvcglassfish;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepository {
    private static List<Alumno> alumnos= new ArrayList<Alumno>();
    static {
        alumnos.add(new Alumno("pedro",20));
        alumnos.add(new Alumno("angel",30));
        alumnos.add(new Alumno("ana",50));
    }

    public List<Alumno> buscarTodos() {
        return alumnos;
    }

    public void insertar(Alumno alumno) {
        alumnos.add(alumno);
    }
}
