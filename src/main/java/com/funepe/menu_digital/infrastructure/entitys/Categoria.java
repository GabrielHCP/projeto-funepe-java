package com.funepe.menu_digital.infrastructure.entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")


public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nm_categoria;
    private String descricao;
    private String imagem;

    // Relação: Uma categoria tem muitos produtos
    @OneToMany(mappedBy = "categoria")
    private List<Cardapio> produtos;

    // Construtores
    public Categoria() {}

    public Categoria(String nm_categoria, String descricao, String imagem) {
        this.nm_categoria = nm_categoria;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nm_categoria; }
    public void setNome(String nome) { this.nm_categoria = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }

    public List<Cardapio> getProdutos() { return produtos; }
    public void setProdutos(List<Cardapio> produtos) { this.produtos = produtos; }


}
