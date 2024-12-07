package com.projetoclm24.clm24java.controller;


import com.projetoclm24.clm24java.entity.AlunoInfo;
import com.projetoclm24.clm24java.service.InfoAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("info")
public class InfoAlunoController {

    @Autowired
    private InfoAlunoService service;

    //query by example  - QBE
    @GetMapping("{id}")
    public AlunoInfo getById(@PathVariable Long id){
        return this.service.findById(id);
    }

   // @GetMapping("escola/{escola}")
  //  public List<AlunoInfo> getContainsEscola(@PathVariable String escola){
      //  return this.service.findAllContainsEscola(escola);
   // }


    @GetMapping("escola/{escola}/ano/{ano}")
    public List<AlunoInfo> getContainsEscola(@PathVariable String escola, @PathVariable int ano){
        return this.service.findAllEscolaAno(escola,ano);
    }


    @GetMapping("escola/{escola}")
    public AlunoInfo AlunoFromEscola(@PathVariable String escola){
        return this.service.findFromEscola(escola);
    }
}
