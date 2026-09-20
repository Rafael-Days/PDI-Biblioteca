package com.pdi.biblioteca.model.dto;

import com.pdi.biblioteca.model.entity.Livro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDTO
{
    private String titulo;
    private String genero;
    private String autor;
    private String editora;
    private Integer paginas;

    public LivroDTO(Livro livro) {
        this.titulo = livro.getTitulo();
        this.genero = livro.getGenero();
        this.autor = livro.getAutor();
        this.editora = livro.getEditora();
        this.paginas = livro.getPaginas();
    }
}
