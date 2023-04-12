package br.com.provaonline.model;

import br.com.provaonline.enums.Dificuldade;
import br.com.provaonline.enums.Materia;
import br.com.provaonline.enums.Questoes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Provas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @Column(name = "nomeProfessor")
    private String nomeProfessor;

  
    @Column(name = "disciplinas")
    @Enumerated(EnumType.STRING)
    private Materia disciplina;

   
    @Column(name = "questoes")
    @Enumerated(EnumType.STRING)
    private Questoes questoes;

   
    @Column(name = "dificuldade")
    @Enumerated(EnumType.STRING)
    private Dificuldade dificuldade;

    

    public Provas toProvas(){
        Provas prova = new Provas();
        prova.setNomeProfessor(this.nomeProfessor);
        prova.setDisciplina(this.disciplina);
        prova.setQuestoes(this.questoes);
        prova.setDificuldade(this.dificuldade);

        return prova;
       
    }

    public Materia getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Materia disciplina) {
        this.disciplina = disciplina;
    }

    
    public Questoes getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questoes questoes) {
        this.questoes = questoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    
    
}
