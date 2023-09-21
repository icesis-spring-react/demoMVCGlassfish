package com.demomvcglassfish;

import jakarta.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {

    GestorCursosServices servicio;


    private List<User> listaUsers = new ArrayList<>();

    public LoginController() {
        super();
        listaUsers.add(new User("pepe", "1234"));
        listaUsers.add(new User("test", "1234"));
    }


    @RequestMapping("/login")
    public String formulario(Model modelo, HttpSession session) {
        User usr = new User();

        modelo.addAttribute("mensaje", session.getAttribute("mensaje"));
        session.removeAttribute("mensaje");
        modelo.addAttribute("user", usr);
        return "login";
    }

    @RequestMapping(value="/autenticar", method= RequestMethod.POST)

    public ModelAndView registrar(@ModelAttribute("user")User usr, HttpSession session) {

        User user = listaUsers.stream().filter(u -> u.getUsername().equals(usr.getUsername()) && u.getClave().equals(usr.getClave())).findFirst().orElse(null);

        if (user == null) {
            session.removeAttribute("user");

            session.setAttribute("mensaje", usr.getUsername() + " no esta en el sistema");
            return  new ModelAndView("redirect:/login");

        }

        session.setAttribute("user", user);
        return  new ModelAndView("redirect:/listaalumnos");
    }

    @RequestMapping(value="/salir", method= RequestMethod.GET)
    public String salir(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/login";
    }

}
