package com.pdi.biblioteca.model.dto;

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
}
