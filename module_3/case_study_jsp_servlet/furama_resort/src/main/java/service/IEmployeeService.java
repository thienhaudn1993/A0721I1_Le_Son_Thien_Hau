package service;


import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();


    Employee findById(String id);

    void save(String id, String name, String email, String address);

    boolean createEmployee(Employee employee);


    boolean remove(String id);
}
