package com.demomvcglassfish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AlumnoController {

    GestorCursosServices servicio;

    @RequestMapping("/listaalumnos")
    public String listaAlumnos(Model modelo) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        servicio = (GestorCursosServices) ctx.getBean("servicio");

        List<Alumno> lista = servicio.buscarTodosAlumnos();
        modelo.addAttribute("listaalumnos", lista);
        modelo.addAttribute("alumno_test", lista.get(0).getNombre());

        return "listaalumnos";
    }

}
