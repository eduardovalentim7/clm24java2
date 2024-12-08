package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@Entity
@Table(name="tbprofessores")
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_professor")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(name="nome_professor", length = 50, unique = true, nullable = false)
    private String professor;
}
