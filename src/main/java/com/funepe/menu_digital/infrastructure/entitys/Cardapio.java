package com.funepe.menu_digital.infrastructure.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "cardapio")

public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;  // Ex: "Lanches", "Bebidas", "Sobremesas"
    private String imagem;     // Caminho da imagem

    // Construtores
    public Cardapio() {}

    public Cardapio(String nome, String descricao, Double preco, String categoria, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    // Getters e Setters (use Lombok ou gere manualmente)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }

}
