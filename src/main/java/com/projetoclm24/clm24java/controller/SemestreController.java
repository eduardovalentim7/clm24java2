package com.projetoclm24.clm24java.controller;

import com.projetoclm24.clm24java.entity.Semestre;
import com.projetoclm24.clm24java.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("semestres")
public class SemestreController {

    @Autowired
    private SemestreService service;

    @PostMapping
    public Semestre salvar(@RequestBody Semestre semestre){
        service.save(semestre);
        return semestre;
    }

    @GetMapping
    public List<Semestre> getAll(){
        return service.findAll();
    }

    @DeleteMapping("{id}")
    public String remover(@PathVariable Long id){
        service.delete(id);
        return "Semestre id= "+id+" excluido com sucesso";
    }

    @PutMapping
    public Semestre atualizar(@RequestBody Semestre semestre){
        service.update(semestre);
        return semestre;
    }
    @GetMapping("{id}")
    public Semestre getById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("total")
    public Long GetTotalSemestres(){
        return service.GetTotalElements();
    }
}

