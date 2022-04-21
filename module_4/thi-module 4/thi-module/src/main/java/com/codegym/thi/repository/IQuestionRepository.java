package com.codegym.thi.repository;

import com.codegym.thi.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends JpaRepository<Question,Long> {
    @Query(value = "select * from Question e where e.title like %?1%",
            countQuery = "select count(*) from Question e where e.title like concat('%',?1,'%')",
            nativeQuery = true)
     Page<Question> searchQuestionByTitle(String name, Pageable pageable);
}
