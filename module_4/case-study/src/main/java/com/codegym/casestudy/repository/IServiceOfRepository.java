package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceOfRepository extends JpaRepository<Service, Long> {
}
