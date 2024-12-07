package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Objects;

//@EqualsAndHashCode(of="id")
//@ToString(of="id")
@Entity
@Table(name="tbcursos")
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_curso", nullable = false)
    private Long id;

    @Column(name="titulo", length = 50, nullable = false, unique = true)
    private String titulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
