package com.demomvcglassfish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestorCursosServices {
    @Autowired
    AlumnoRepository repoAlumno;

    public void insertarAlumno(Alumno alumno) {
        repoAlumno.insertar(alumno);
    }

    public List<Alumno> buscarTodosAlumnos() {
        return repoAlumno.buscarTodos();
    }
}
