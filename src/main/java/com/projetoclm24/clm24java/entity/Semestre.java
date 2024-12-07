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
@Table(name="tbsemestres")
public class Semestre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_semestre")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(name="semestre", nullable = false, unique = true)
    private double semestre;
}
