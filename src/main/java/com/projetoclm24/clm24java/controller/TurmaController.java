package com.projetoclm24.clm24java.controller;

import com.projetoclm24.clm24java.entity.Turma;
import com.projetoclm24.clm24java.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("turmas")
public class TurmaController {

    @Autowired
    private TurmaService service;


    @PostMapping
    public Turma salvar(@RequestBody Turma turma){
        service.save(turma);
        return turma;
    }

    @GetMapping
    public List<Turma> getAll(){
        return service.findAll();
    }

    @DeleteMapping("{id}")
    public String remover(@PathVariable Long id){
        return "Turma id= " +id+ " excluído com sucesso!!";
    }
}
