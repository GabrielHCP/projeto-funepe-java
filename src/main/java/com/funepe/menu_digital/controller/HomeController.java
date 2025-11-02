package com.funepe.menu_digital.controller;

import com.funepe.menu_digital.infrastructure.entitys.Cardapio;
import com.funepe.menu_digital.infrastructure.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CardapioRepository CardapioRepository;

    @GetMapping("/")
    public String home(Model model) {
        // Busca TODOS os produtos ordenados por categoria
        List<Cardapio> cardapioCompleto = CardapioRepository.findAllOrderByCategoriaAndNome();

        model.addAttribute("titulo", "Cardápio Digital");
        model.addAttribute("cardapio", cardapioCompleto);

        return "home";
    }

}