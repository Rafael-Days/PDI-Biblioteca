package com.pdi.biblioteca.repository;

import com.pdi.biblioteca.model.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Livro, Long> {
}
