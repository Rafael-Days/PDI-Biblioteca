package com.pdi.biblioteca.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String genero;
    private String autor;
    private String editora;
    private Integer paginas;
    private boolean disponivel;

    @OneToMany(mappedBy = "livro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emprestimo> emprestimos;

    public Livro() {
    }

    public Livro(String titulo, String genero, String autor, String editora, Integer paginas, boolean disponivel) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.disponivel = disponivel;
    }
}
