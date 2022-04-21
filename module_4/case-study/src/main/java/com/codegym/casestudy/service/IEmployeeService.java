package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Employee findEmployeeById(Long id);

    void save(Employee employee);

    void deleteEmployeeById(Long id);

    Page<Employee> searchEmployeeByName(String name, Pageable pageable);

    List<Employee> findAll();
}
