package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="tbturmas")
public class Turma implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_turma")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(name="turma", unique = true, length = 50, nullable = false)
    private String turma;
}
