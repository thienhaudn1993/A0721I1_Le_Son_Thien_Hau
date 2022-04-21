package com.codegym.thi.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = " Không được để trống")
    @Size(min = 5, max = 100, message = " Từ 5 đến 100 ký tự")
    private String title;
    @NotEmpty(message = " Không được để trống")
    @Size(min = 10, max = 500, message = " Từ 10 đến 500 ký tự")
    private String question;
    @NotEmpty(message = " Không được để trống")
    private String answer;
    @NotEmpty(message = " Không được để trống")
    private String date_create;
    @NotEmpty(message = " Không được để trống")
    private String status;
    @ManyToOne(targetEntity = QuestionType.class)
    @JoinColumn(name = "id_question_type", nullable = false)
    private QuestionType questionType;

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
