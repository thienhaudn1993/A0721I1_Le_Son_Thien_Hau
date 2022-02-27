package com.codegym.customer_managerment.repository;

import com.codegym.customer_managerment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    List<Customer> findByNameAndId(String name, Long id);
}
