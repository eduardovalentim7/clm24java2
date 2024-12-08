package com.projetoclm24.clm24java.service;


import com.projetoclm24.clm24java.entity.Professor;
import com.projetoclm24.clm24java.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    @Transactional(readOnly = false)
    public void save(Professor nome_professor){
        this.repository.save(nome_professor);
    }

}
