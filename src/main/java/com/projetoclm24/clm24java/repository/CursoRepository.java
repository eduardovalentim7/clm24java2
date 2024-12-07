package com.projetoclm24.clm24java.repository;

import com.projetoclm24.clm24java.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Optional<Curso> findByTitulo(String titulo);

    List<Curso> findByTituloStartsWith(String titulo);

    List<Curso> findByTituloIn(List<String> titulos);

    List<Curso> findByOrderByTituloAsc();
}
