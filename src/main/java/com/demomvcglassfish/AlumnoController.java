package com.demomvcglassfish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlumnoController {

    GestorCursosServices servicio;


    private List<Nota> listaNotas = new ArrayList<>();

    public AlumnoController() {
        super();
        listaNotas.add(new Nota(1, "Malo"));
        listaNotas.add(new Nota(3, "Regular"));
        listaNotas.add(new Nota(4, "Bueno"));
        listaNotas.add(new Nota(5, "Excelente"));
    }

    @RequestMapping("/listaalumnos")
    public String listaAlumnos(Model modelo) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        servicio = (GestorCursosServices) ctx.getBean("servicio");

        List<Alumno> lista = servicio.buscarTodosAlumnos();
        modelo.addAttribute("listaalumnos", lista);
        return "listaalumnos";
    }

    @RequestMapping("/consultar")
    public String consultar(@RequestParam("nombre") String nombre, Model modelo) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        servicio = (GestorCursosServices) ctx.getBean("servicio");

        Alumno alumno = servicio.consultar(nombre);
        modelo.addAttribute("alumno", alumno);
        return "alumno";
    }

    @RequestMapping("/formulario")
    public String formulario(Model modelo) {
        Alumno alumno = new Alumno();

        modelo.addAttribute("alumnoFrm", alumno);
        modelo.addAttribute("posibles_notas", listaNotas);
        return "formulario";
    }

    @RequestMapping(value="/registrar", method= RequestMethod.POST)
    public ModelAndView registrar(@ModelAttribute("alumnoFrm")Alumno alumno, Model modelo) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        servicio = (GestorCursosServices) ctx.getBean("servicio");

        /*
        Nota n = listaNotas.stream().filter(nota -> nota.getValor() == alumno.getNota().getValor()).findFirst().orElse(null);
        alumno.setNota(n);
        */
        servicio.insertarAlumno(alumno);

        return  new ModelAndView("redirect:/listaalumnos");
    }

}
