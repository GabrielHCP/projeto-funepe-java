package com.funepe.menu_digital.infrastructure.repository;

import com.funepe.menu_digital.infrastructure.entitys.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

    // Query para trazer todos os produtos ordenados por categoria e nome
    @Query("SELECT c FROM Cardapio c ORDER BY c.categoria, c.nome")
    List<Cardapio> findAllOrderByCategoriaAndNome();

    // Método para buscar por categoria
    List<Cardapio> findByCategoriaOrderByNome(String categoria);

    // Método para buscar as categorias
    List<Cardapio> findByCategoria(String categoria);

    @Query("SELECT DISTINCT c.categoria FROM Cardapio c ORDER BY c.categoria")
    List<String> findDistinctCategorias();


}
