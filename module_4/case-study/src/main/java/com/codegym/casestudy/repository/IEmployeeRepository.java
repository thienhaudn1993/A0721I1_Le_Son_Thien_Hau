package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select * from Employee where employee_name like %?1%",
            countQuery = "SELECT count(*) FROM employee e WHERE e.employee_name like concat('%',?1,'%')",
            nativeQuery = true)
    Page<Employee> searchEmployeeByName(String name, Pageable pageable);

    @Query(value = "select * from Employee where Employee.username=?1", nativeQuery = true)
    Employee getEmployeeByUser(String username);
}
