package com.projetoclm24.clm24java.service;

import com.projetoclm24.clm24java.entity.Turma;
import com.projetoclm24.clm24java.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    //Incluir
    @Transactional(readOnly = false)
    public void save(Turma turma){
        this.repository.save(turma);
    }

    //listar
    public List<Turma> findAll(){
        return this.repository.findAll();
    }

    //Excluir
   @Transactional(readOnly = false)
    public void delete(Long id){
        this.repository.deleteById(id);
    }
}
