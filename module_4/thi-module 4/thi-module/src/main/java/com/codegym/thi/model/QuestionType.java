package com.codegym.thi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question_type;
    private String name;
    @OneToMany(mappedBy = "questionType")
    Set<Question> questions;

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public QuestionType() {
    }

    public Long getId_question_type() {
        return id_question_type;
    }

    public void setId_question_type(Long id_question_type) {
        this.id_question_type = id_question_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
