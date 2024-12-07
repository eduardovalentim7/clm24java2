package com.projetoclm24.clm24java.service;

import com.projetoclm24.clm24java.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository repository;


}
