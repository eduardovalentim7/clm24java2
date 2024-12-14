package com.projetoclm24.clm24java.service;


import com.projetoclm24.clm24java.entity.Curso;
import com.projetoclm24.clm24java.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService {

 @Autowired
    private CursoRepository repository;

 //insert em lote
 @Transactional(readOnly = false)
 public List<Curso> save(List<Curso> curso){
     return this.repository.saveAll(curso);
 }

 //consulta  - query by Keyword
    @Transactional(readOnly = true)
    public Curso finfByCurso(String titulo){
     return this.repository.findByTitulo(titulo).orElseGet(Curso::new);
    }

    //consulta por parte do nome   - query by Keyword
    @Transactional(readOnly = true)
    public List<Curso> findByInicio(String titulo){
        return this.repository.findByTituloStartsWith(titulo);
    }

    //consulta por mais de 1 nome por vez    - query by Keyword
    @Transactional(readOnly = true)
    public List<Curso> findByTitulos(List<String> titulos){
        return this.repository.findByTituloIn(titulos);
    }

    //Ordena por id   - query by Keyword
    @Transactional(readOnly = true)
    public List<Curso> findAllOrderByTitulosAsc(){
        return this.repository.findByOrderByTituloAsc();
    }



}
