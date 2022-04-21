package com.codegym.thi.repository;

import com.codegym.thi.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Long> {
}
