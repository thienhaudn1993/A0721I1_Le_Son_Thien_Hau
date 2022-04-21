package com.codegym.thi.service.Impl;

import com.codegym.thi.model.Question;
import com.codegym.thi.repository.IQuestionRepository;
import com.codegym.thi.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    IQuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public Question findQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Page<Question> searchQuestionByTitle(String name, Pageable pageable) {
        return questionRepository.searchQuestionByTitle(name,pageable);
    }
}
