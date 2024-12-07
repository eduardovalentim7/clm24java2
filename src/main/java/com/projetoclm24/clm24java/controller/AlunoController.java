package com.projetoclm24.clm24java.controller;


import com.projetoclm24.clm24java.entity.Aluno;
import com.projetoclm24.clm24java.entity.AlunoInfo;
import com.projetoclm24.clm24java.projection.AlunoInfoProjection;
import com.projetoclm24.clm24java.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno){
        service.save(aluno);
        return aluno;
    }

    @PutMapping
    public Aluno atualizar(@RequestBody Aluno aluno){
        service.update(aluno);
        return aluno;
    }

    @DeleteMapping("{id}")
    public String remover(@PathVariable Long id){
        service.delete(id);
        return "Aluno id = " + id + " foi excluido com sucesso";
    }

    @GetMapping("{id}")
     public Aluno getById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<Aluno> getAll(){
        return service.findAll();
    }

    @GetMapping("total")
    public Long getTotalDeAlunos(){
        return service.getTotalElements();
    }

    //rota referente a Aluno Info - Busca por ID
    @PutMapping("{id}/info")
    public Aluno salvarInfoAluno(@PathVariable Long id, @RequestBody AlunoInfo alunoInfo){
        return service.saveInfoAluno(alunoInfo, id);
    }

    //projection
    @GetMapping("aluno-info")
    public AlunoInfoProjection salvarInfoAluno(@RequestParam Long id){
        return service.findAlunoInfoById(id);
    }
}
