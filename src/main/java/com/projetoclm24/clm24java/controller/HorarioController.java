package com.projetoclm24.clm24java.controller;

import com.projetoclm24.clm24java.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("horarios")
public class HorarioController {

    @Autowired
    private HorarioService service;
}
