package com.codegym.managercustomer.repository;

import com.codegym.managercustomer.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
