package com.projetoclm24.clm24java.repository;

import com.projetoclm24.clm24java.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
