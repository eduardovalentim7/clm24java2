package com.projetoclm24.clm24java.service;

import com.projetoclm24.clm24java.entity.Semestre;
import com.projetoclm24.clm24java.repository.SemestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SemestreService {

    @Autowired
    private SemestreRepository repository;

    //Incluir
    @Transactional(readOnly = false)
    public void save(Semestre semestre){
        this.repository.save(semestre);
    }

    //listar
    @Transactional(readOnly = true)
    public List<Semestre> findAll(){
      return this.repository.findAll();
    }

    //excluir
    @Transactional(readOnly = false)
    public void delete(Long id){
        this.repository.deleteById(id);
    }

    //Editar
    @Transactional(readOnly = false)
    public void update(Semestre semestre){
        this.repository.save(semestre);
    }

    //Busca por Id
    @Transactional(readOnly = true)
    public Semestre findById(Long id){
       return this.repository.findById(id).orElseThrow(
                ()-> new RuntimeException("Semestre id=" + id + "não encontrado")
        );
    }



}
