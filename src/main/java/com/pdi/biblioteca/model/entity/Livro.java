package com.pdi.biblioteca.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import jakarta.persistence.Id;
import lombok.Setter;

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
