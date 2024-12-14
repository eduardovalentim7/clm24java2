package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@ToString
@Entity
@Table(name="tbprofessores")
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_professor")
    private Long id;

    @Column(name="nome_professor", length = 50)
    private String professor;


    //relacionamento com Turma N-N

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="professor_tem_turma",
    joinColumns = @JoinColumn(name="id_professor"),
            inverseJoinColumns = @JoinColumn(name="id_turma")
    )
    private List<Turma> turma;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", professor='" + professor + '\'' +
                '}';
    }
}
