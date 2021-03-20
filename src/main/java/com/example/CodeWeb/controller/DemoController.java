package com.example.CodeWeb.controller;

import com.example.CodeWeb.model.Persona;
import com.example.CodeWeb.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*Un controlador es una clase del modelo MVC
encargada de redireccionar hacia una lógica de negocio*/
@Controller
public class DemoController {

    /*@Autowired para la Instancia de IPersonaRepo*/
    @Autowired
    private IPersonaRepo repo;

    /*Peticiones GET, PUT, POST, etc*/
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre("Chris");
        repo.save(p);
        model.addAttribute("name", name);
        return "greeting";
    }
}
