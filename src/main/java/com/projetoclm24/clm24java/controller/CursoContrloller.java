package com.projetoclm24.clm24java.controller;

import com.projetoclm24.clm24java.entity.Curso;
import com.projetoclm24.clm24java.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoContrloller {

    @Autowired
    private CursoService service;

@PostMapping
    public List<Curso> salvar (@RequestBody List<Curso> cursos){
    return this.service.save(cursos);
    }

    @GetMapping("titulo/{titulo}")
    public Curso getByNomeCurso (@PathVariable String titulo){
        return this.service.finfByCurso(titulo);
    }

    @GetMapping("titulo/inicio/{titulo}")
    public List<Curso> getByInicioTitulo(@PathVariable String titulo){
        return this.service.findByInicio(titulo);
    }

    @GetMapping("titulos")
    public List<Curso> getByTitulos(@RequestParam(name="t") List<String> titulos){
        return this.service.findByTitulos(titulos);
    }

    @GetMapping
    public List<Curso> getCursosOrdenadosAsc(){
        return this.service.findAllOrderByTitulosAsc();
    }
}
