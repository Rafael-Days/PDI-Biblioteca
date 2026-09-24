package com.pdi.biblioteca.service;

import com.pdi.biblioteca.model.dto.LivroDTO;
import com.pdi.biblioteca.model.entity.Livro;
import com.pdi.biblioteca.repository.EmprestimoRepository;
import com.pdi.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

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

    public LivroDTO cadastrarLivro(LivroDTO dto) {

        Livro livro = new Livro(
                dto.getTitulo(),
                dto.getGenero(),
                dto.getAutor(),
                dto.getEditora(),
                dto.getPaginas(),
                dto.isDisponivel()
        );

        Livro livroSalvo = repository.save(livro);

        return new LivroDTO(livroSalvo);
    }

    public LivroDTO atualizarLivro(Long id, LivroDTO dto) {

        Livro livro = repository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND)
                );

        livro.setTitulo(dto.getTitulo());
        livro.setGenero(dto.getGenero());
        livro.setAutor(dto.getAutor());
        livro.setEditora(dto.getEditora());
        livro.setPaginas(dto.getPaginas());
        livro.setDisponivel(dto.isDisponivel());

        Livro livroAtualizado = repository.save(livro);

        return new LivroDTO(livroAtualizado);
    }

    public void deletarLivro(Long id){
        Livro livro = repository.findById(id)
                .orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND)
        );

        repository.delete(livro);
    }
}
