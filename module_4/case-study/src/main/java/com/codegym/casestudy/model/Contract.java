package com.codegym.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contract_id;
    private String contract_start_date;
    private String contract_end_date;
    private double contract_deposit;
    private double contract_total_money;
    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(targetEntity = Service.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    Set<ContractDetail> contractDetailSet;


    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Contract() {
    }

    public Long getContract_id() {
        return contract_id;
    }

    public void setContract_id(Long contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(String contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(String contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    @Min(value = 1, message = "Tien coc phai la so duong")
    public double getContract_deposit() {
        return contract_deposit;
    }

    public void setContract_deposit(double contract_deposit) {
        this.contract_deposit = contract_deposit;
    }

    @Min(value = 1, message = "Tien tien phai la so duong")
    public double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }
}
