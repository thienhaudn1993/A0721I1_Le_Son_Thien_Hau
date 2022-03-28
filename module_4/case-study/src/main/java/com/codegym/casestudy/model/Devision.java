package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Devision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devision_id;
    private String devision_name;

    @OneToMany(mappedBy = "devision")
    Set<Employee> employeeSet;

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Devision() {
    }

    public Long getDevision_id() {
        return devision_id;
    }

    public void setDevision_id(Long devision_id) {
        this.devision_id = devision_id;
    }

    public String getDevision_name() {
        return devision_name;
    }

    public void setDevision_name(String devision_name) {
        this.devision_name = devision_name;
    }
}
