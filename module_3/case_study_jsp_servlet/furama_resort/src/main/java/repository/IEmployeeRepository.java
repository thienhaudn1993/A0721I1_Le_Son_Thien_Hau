package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    Employee findById(String id);

    void createEmployee(Employee employee);

    void save(String id,String name, String email, String address);

    void remove(String id);

    List<Employee> search(String name, String email, String divisionId);
}
