package com.projetoclm24.clm24java.controller;


import com.projetoclm24.clm24java.entity.Professor;
import com.projetoclm24.clm24java.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping
    public Professor Salvar(@RequestBody Professor nome_professor){
        service.save(nome_professor);
        return nome_professor;
    }
}
