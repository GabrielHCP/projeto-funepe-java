package com.funepe.menu_digital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Menu Digital - Faculdade");
        model.addAttribute("mensagem", "Bem-vindo ao sistema de cardápio digital!");
        return "home";  // ← vai buscar templates/home.html
    }

    @GetMapping("/cardapio")
    public String cardapio() {
        return "cardapio";  // ← templates/cardapio.html
    }
}