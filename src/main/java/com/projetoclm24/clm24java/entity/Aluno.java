package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name="tbalunos")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_aluno", nullable = false)
    private Long id;

    @Column(name="nome_aluno", length = 80, nullable = false)
    private String nome;

    @Column(name = "email_aluno")
    private String email;

    //Relacionamento
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name="id_info")
    private AlunoInfo alunoInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AlunoInfo getAlunoInfo() {
        return alunoInfo;
    }

    public void setAlunoInfo(AlunoInfo alunoInfo) {
        this.alunoInfo = alunoInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                '}';
    }
}
