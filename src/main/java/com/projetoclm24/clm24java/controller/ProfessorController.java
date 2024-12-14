package com.projetoclm24.clm24java.controller;


import com.projetoclm24.clm24java.entity.Professor;
import com.projetoclm24.clm24java.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping
    public Professor Salvar(@RequestBody Professor professor){
        service.save(professor);
        return professor;
    }

    @GetMapping
    public List<Professor> getAll(){
        return service.findAll();
    }

    @DeleteMapping("{id}")
    public String remover(@PathVariable Long id){
        service.delete(id);
        return "O id " + id + " foi excluido com sucesso!";
    }

    @PutMapping
    public Professor atualizar(@RequestBody Professor professor){
        service.update(professor);
        return professor;
    }
}
