package com.demomvcglassfish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value="/fact", method = RequestMethod.GET)
    public String factorial(ModelMap model) {


        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.scan("com.demomvcglassfish");
        context.refresh();

        MyServiceClass myServiceClass
                = context.getBean(MyServiceClass.class);

        // Testing the factorial method
        int factorialOf5 = myServiceClass.factorial(5);

        model.addAttribute("message", "factorial de 5 es:  " + factorialOf5);
        return "hello";
    }
}
