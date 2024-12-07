package com.projetoclm24.clm24java.entity;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tbinfoalunos")
public class AlunoInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_info", nullable = false)
    private Long id;

    @Column(name="escola", nullable = false)
     private String escola;

    @Column(name="ano_conclusao")
     private int ano_conclusao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getAno_conclusao() {
        return ano_conclusao;
    }

    public void setAno_conclusao(int ano_conclusao) {
        this.ano_conclusao = ano_conclusao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoInfo alunoInfo = (AlunoInfo) o;
        return Objects.equals(id, alunoInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return "AlunoInfo{" +
                "id=" + id +
                '}';
    }
}
