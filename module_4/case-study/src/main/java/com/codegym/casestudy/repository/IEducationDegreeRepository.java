package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationDegreeRepository extends JpaRepository<EducationDegree, Long> {
}
