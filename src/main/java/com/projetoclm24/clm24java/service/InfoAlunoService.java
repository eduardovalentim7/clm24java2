package com.projetoclm24.clm24java.service;

import com.projetoclm24.clm24java.entity.AlunoInfo;
import com.projetoclm24.clm24java.repository.InfoAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class InfoAlunoService {

    @Autowired
    private InfoAlunoRepository repository;

    //query by example  - QBE
    public AlunoInfo findById(Long id){
    AlunoInfo info = new AlunoInfo();
    info.setId(id);
    return this.repository.findOne(Example.of(info)).orElseGet(AlunoInfo::new);
}

//busca pela parte
public List<AlunoInfo> findAllContainsEscola(String escola ){
    AlunoInfo info = new AlunoInfo();
    info.setEscola(escola);

    ExampleMatcher matcher = ExampleMatcher.matching()
                    .withMatcher("escola",ExampleMatcher.GenericPropertyMatchers.contains());


    return this.repository.findAll(Example.of(info, matcher));

}


    //busca pela parte
    public List<AlunoInfo> findAllEscolaAno(String escola, int ano ){
        AlunoInfo info = new AlunoInfo();
        info.setEscola(escola);
        info.setAno_conclusao(ano);

        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withMatcher("escola",ExampleMatcher.GenericPropertyMatchers.startsWith())
                .withMatcher("ano",ExampleMatcher.GenericPropertyMatchers.contains());


        return this.repository.findAll(Example.of(info, matcher));

    }

    public AlunoInfo findFromEscola(String escola ){
        AlunoInfo info = new AlunoInfo();
        info.setEscola(escola);


        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("escola",ExampleMatcher.GenericPropertyMatchers.contains());


        return this.repository.findBy(
                Example.of(info, matcher),
                query->query.sortBy(Sort.by("escola").descending()).first()
        ).orElseGet(AlunoInfo::new);

    }



}
