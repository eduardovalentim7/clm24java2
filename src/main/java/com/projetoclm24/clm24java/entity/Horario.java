package com.projetoclm24.clm24java.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="tbhorarios")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_horario")
    private Long id;

    @Column(name="turno", length = 50, nullable = false)
    private String turno;

    @Column(name="horario", nullable = false, unique = true)
    private String horario;


    //relacionamento
   // @ManyToOne
  //  @JoinColumn(name="id_curso") //Muitos horarios para 1 curso - id_curso é a chave estrangeira
  // private Curso curso;

    //muitos para muitos
   // @ManyToMany(fetch = FetchType.LAZY)
  // @JoinTable(name="curso_tem_horario",
   // joinColumns = @JoinColumn(name="id_horario"),
    //        inverseJoinColumns =  @JoinColumn(name="id_curso")

//)
   // private List<Curso> cursos;

   // public List<Curso> getCursos() {
       // return cursos;
 //   }

  //  public void setCursos(List<Curso> cursos) {
    //    this.cursos = cursos;
    //}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(id, horario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                '}';
    }
}
