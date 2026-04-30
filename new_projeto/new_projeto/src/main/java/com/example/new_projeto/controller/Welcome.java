package com.example.new_projeto.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/")
    public String mensagem(){
        return "Bem-Vindo";
    }
    @RequestMapping("/dev")
    public  String nomedev(){
        return "Feito por: Bruno Rosa";
    }
}
