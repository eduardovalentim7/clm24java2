package com.projetoclm24.clm24java.repository;

import com.projetoclm24.clm24java.entity.Aluno;
import com.projetoclm24.clm24java.projection.AlunoInfoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    @Query("select a.alunoInfo.escola as escola, a.email as email from Aluno a where a.id = :id")
    AlunoInfoProjection findAlunoById(Long id);
}
