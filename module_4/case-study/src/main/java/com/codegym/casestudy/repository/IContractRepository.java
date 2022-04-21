package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Long> {
}
