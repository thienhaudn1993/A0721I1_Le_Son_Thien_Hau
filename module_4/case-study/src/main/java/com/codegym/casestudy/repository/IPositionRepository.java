package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Long> {
}
