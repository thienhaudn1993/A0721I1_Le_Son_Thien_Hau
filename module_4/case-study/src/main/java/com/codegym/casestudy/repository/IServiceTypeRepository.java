package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType, Long> {
}
