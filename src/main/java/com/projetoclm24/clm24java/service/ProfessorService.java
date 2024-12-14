package com.projetoclm24.clm24java.service;


import com.projetoclm24.clm24java.entity.Professor;
import com.projetoclm24.clm24java.entity.Turma;
import com.projetoclm24.clm24java.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;


    @Transactional(readOnly = false)
    public void save(Professor professor){
        this.repository.save(professor);
    }

    @Transactional(readOnly = true)
    public List<Professor> findAll(){
        return this.repository.findAll();
    }

    @Transactional(readOnly = false)
    public void delete(Long id){
        this.repository.deleteById(id);
    }

    @Transactional(readOnly = false)
    public void update(Professor professor){
        this.repository.save(professor);
    }

}
