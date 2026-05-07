package com.example.spring_basico.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// @RestController
// Controla a classe para criar endpoints.
@RestController
public class Welcome {

    // endpoint Raiz.
    @GetMapping ("/")
    public String mensagem () {
        return "Bem-vindo!";
    }
    @GetMapping("/dev")
    public String nomeDev() {
        return "Feito por: Bruno Rosa!";
    }
}
