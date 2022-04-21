package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "select * from Customer where customer_name like %?1%", nativeQuery = true)
    Page<Customer> searchCustomerByName(String name, Pageable pageable);
}
