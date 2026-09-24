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

}
