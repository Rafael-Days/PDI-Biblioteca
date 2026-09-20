package com.pdi.biblioteca.controler;

import com.pdi.biblioteca.model.dto.LivroDTO;
import com.pdi.biblioteca.model.entity.Livro;
import com.pdi.biblioteca.repository.EmprestimoRepository;
import com.pdi.biblioteca.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/emprestar")
public class EmprestimoController {

    @Autowired
    private EmprestimoService service;

    @GetMapping
    public List<LivroDTO> ListaLivros(){
        return service.listarLivros();
    }

    @GetMapping("/{id}")
    public LivroDTO ListaLivroId(@PathVariable Long id){
        return service.buscarLivro(id);
    }
}
