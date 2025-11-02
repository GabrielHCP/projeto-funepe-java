package com.funepe.menu_digital.config;

import com.funepe.menu_digital.infrastructure.entitys.Cardapio;
import com.funepe.menu_digital.infrastructure.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CardapioRepository cardapioRepository;

    @Override
    public void run(String... args) throws Exception {

        // Limpa a tabela (apenas em desenvolvimento)
        cardapioRepository.deleteAll();

        // Adiciona produtos de exemplo
        cardapioRepository.save(new Cardapio(
                "X-Burger Clássico",
                "Pão brioche, hambúrguer 180g, queijo cheddar, alface, tomate",
                18.90,
                "Lanches",
                "/images/hamburguer.webp"
        ));

        cardapioRepository.save(new Cardapio(
                "Batata Frita Crocante",
                "Porção de batata frita crocante com tempero especial",
                12.50,
                "Acompanhamentos",
                "/images/batata.webp"
        ));

        cardapioRepository.save(new Cardapio(
                "Coca-Cola Lata",
                "Lata 350ml gelada",
                6.00,
                "Bebidas",
                "/images/refrigerante.webp"
        ));

        cardapioRepository.save(new Cardapio(
                "X-Bacon Supremo",
                "Pão brioche, hambúrguer 180g, queijo, bacon crocante",
                22.90,
                "Lanches",
                "/images/xbacon.webp"
        ));

        cardapioRepository.save(new Cardapio(
                "Milkshake Chocolate",
                "Milkshake cremoso de chocolate com chantilly",
                14.90,
                "Sobremesas",
                "/images/milkshake.webp"
        ));

        System.out.println("🎉 Dados iniciais carregados! Total: " + cardapioRepository.count() + " produtos.");
    }
}