package com.projetoclm24.clm24java.repository;

import com.projetoclm24.clm24java.entity.AlunoInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoAlunoRepository extends JpaRepository<AlunoInfo, Long> {
    //injeta no service
}
