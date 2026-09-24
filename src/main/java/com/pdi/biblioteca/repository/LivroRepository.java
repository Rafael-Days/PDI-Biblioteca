package com.pdi.biblioteca.repository;

import com.pdi.biblioteca.model.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
