package com.pdi.biblioteca.service;

import com.pdi.biblioteca.model.dto.EmprestimoDTO;
import com.pdi.biblioteca.model.entity.Emprestimo;
import com.pdi.biblioteca.model.entity.Livro;
import com.pdi.biblioteca.repository.EmprestimoRepository;
import com.pdi.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    @Autowired
    private LivroRepository livroRepository;

    public EmprestimoDTO cadastrarEmprestimo(EmprestimoDTO dto) {

        Livro livro = livroRepository.findById(dto.getLivroId())
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND)
                );

        Emprestimo emprestimo = new Emprestimo();

        emprestimo.setLivro(livro);
        emprestimo.setPessoa(dto.getPessoa());
        emprestimo.setDataEmprestimo(dto.getDataEmprestimo());
        emprestimo.setDataDevolucao(dto.getDataDevolucao());

        repository.save(emprestimo);

        return dto;
    }

    public List<EmprestimoDTO> listarEmprestimos() {
        return repository.findAll().stream().map(EmprestimoDTO::new).toList();
    }
}
