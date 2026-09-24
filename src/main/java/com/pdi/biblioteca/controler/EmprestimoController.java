package com.pdi.biblioteca.controler;

import com.pdi.biblioteca.model.dto.EmprestimoDTO;
import com.pdi.biblioteca.model.dto.LivroDTO;
import com.pdi.biblioteca.model.entity.Livro;
import com.pdi.biblioteca.repository.EmprestimoRepository;
import com.pdi.biblioteca.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/emprestar")
public class EmprestimoController {

    @Autowired
    private EmprestimoService service;

    @PostMapping
    public EmprestimoDTO cadastrarEmprestimo(
            @RequestBody EmprestimoDTO dto) {

        return service.cadastrarEmprestimo(dto);
    }
}
