package com.codegym.thi.service;

import com.codegym.thi.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionService {
    Page<Question> findAll(Pageable pageable);
    Question findQuestionById(Long id);
    void saveQuestion(Question question);
    void deleteQuestion(Long id);
    Page<Question> searchQuestionByTitle(String name,Pageable pageable);

}
