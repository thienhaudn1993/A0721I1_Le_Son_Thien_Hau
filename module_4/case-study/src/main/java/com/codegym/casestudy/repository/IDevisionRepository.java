package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Devision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDevisionRepository extends JpaRepository<Devision, Long> {
}
