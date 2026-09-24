package com.pdi.biblioteca.controler;

import com.pdi.biblioteca.model.dto.LivroDTO;
import com.pdi.biblioteca.service.EmprestimoService;
import com.pdi.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping
    public List<LivroDTO> ListaLivros(){
        return service.listarLivros();
    }

    @GetMapping("/{id}")
    public LivroDTO ListaLivroId(@PathVariable Long id){
        return service.buscarLivro(id);
    }

    @PostMapping
    public LivroDTO cadastrarLivro(@RequestBody LivroDTO dto) {
        return service.cadastrarLivro(dto);
    }

    @PutMapping("/{id}")
    public LivroDTO atualizarLivro(
            @PathVariable Long id,
            @RequestBody LivroDTO dto) {

        return service.atualizarLivro(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(
            @PathVariable Long id) {
        service.deletarLivro(id);
    }
}
