package br.com.demoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class InicioController {

    @GetMapping
    public String inicio() {
        return "API FUNCIONANDO CODEPIPELINE";
    }
}
