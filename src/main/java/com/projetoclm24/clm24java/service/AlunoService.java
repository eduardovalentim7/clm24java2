package com.projetoclm24.clm24java.service;

import com.projetoclm24.clm24java.entity.Aluno;
import com.projetoclm24.clm24java.entity.AlunoInfo;
import com.projetoclm24.clm24java.projection.AlunoInfoProjection;
import com.projetoclm24.clm24java.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Transactional(readOnly = false)
    public void save(Aluno aluno){
        this.repository.save(aluno);
    }

    @Transactional(readOnly = false)
    public void update(Aluno aluno){
        this.repository.save(aluno);
    }

    @Transactional(readOnly = false)
    public void delete(Long id){
        this.repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Aluno findById(Long id){
        this.repository.findById(id).orElseGet(Aluno::new);
        return this.repository.findById(id).orElseThrow(
                ()-> new RuntimeException("Aluno id = " + id + "não encontrado")
                );
    }

    @Transactional(readOnly = true)
  public List<Aluno> findAll(){
        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public Long getTotalElements(){
        return this.repository.count();
    }

    //operações com Aluno Info
    //salvar
    @Transactional(readOnly = false)
    public Aluno saveInfoAluno(AlunoInfo alunoInfo, Long alunoId){
        Aluno aluno = findById(alunoId);
        aluno.setAlunoInfo(alunoInfo);
        return aluno;
    }

    //trabalhando com projection
    @Transactional(readOnly = true)
    public AlunoInfoProjection findAlunoInfoById(Long id){
        return this.repository.findAlunoById(id);
    }





}
