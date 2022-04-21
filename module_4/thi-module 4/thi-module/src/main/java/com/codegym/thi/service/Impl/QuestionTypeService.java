package com.codegym.thi.service.Impl;

import com.codegym.thi.model.QuestionType;
import com.codegym.thi.repository.IQuestionTypeRepository;
import com.codegym.thi.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    IQuestionTypeRepository questionTypeRepository;
    @Override
    public List<QuestionType> findQuestionTypeByAll() {
        return questionTypeRepository.findAll();
    }

}
