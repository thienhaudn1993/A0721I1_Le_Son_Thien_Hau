package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(String id) {
        return iEmployeeRepository.findById(id);
    }

    @Override
    public void save(String id, String name, String email, String address) {
        iEmployeeRepository.save(id,name,email,address);
    }


    @Override
    public boolean createEmployee(Employee employee) {
        Employee employee1 = findById(String.valueOf(employee.getEmployee_id()));
        if (employee1 != null)  {
            return false;
        }else {
            iEmployeeRepository.createEmployee(employee);
            return true;
        }
    }

    @Override
    public boolean remove(String id) {
        Employee employee1 = findById(id);
        if (employee1 == null) {
            return false;
        }else {
            iEmployeeRepository.remove(id);
            return true;
        }
    }
}
