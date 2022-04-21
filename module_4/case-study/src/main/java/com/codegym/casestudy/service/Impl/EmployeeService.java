package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Employee;
import com.codegym.casestudy.repository.IEmployeeRepository;
import com.codegym.casestudy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> searchEmployeeByName(String name, Pageable pageable) {
        return employeeRepository.searchEmployeeByName(name, pageable);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
