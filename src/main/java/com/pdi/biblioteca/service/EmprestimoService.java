package com.pdi.biblioteca.service;

import com.pdi.biblioteca.model.dto.LivroDTO;
import com.pdi.biblioteca.model.entity.Livro;
import com.pdi.biblioteca.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    public List<LivroDTO> listarLivros() {
        return repository.findAll()
                .stream()
                .map(LivroDTO::new)
                .toList();
    }

    public LivroDTO buscarLivro(Long id){
        Livro livro = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new LivroDTO(livro);
    }
}
