package com.pdi.biblioteca.model.dto;

import com.pdi.biblioteca.model.entity.Emprestimo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmprestimoDTO {
    private Long livroId;
    private String pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public EmprestimoDTO() {
    }

    public EmprestimoDTO(Emprestimo emprestimo) {
        this.livroId = emprestimo.getLivro().getId();
        this.pessoa = emprestimo.getPessoa();
        this.dataEmprestimo = emprestimo.getDataEmprestimo();
        this.dataDevolucao = emprestimo.getDataDevolucao();
    }
}
