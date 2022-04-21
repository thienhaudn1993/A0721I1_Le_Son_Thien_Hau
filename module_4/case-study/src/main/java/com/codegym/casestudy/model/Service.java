package com.codegym.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity

public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_id;
    @NotEmpty(message = "Khong duoc de trong")
    @Size(min = 1, max = 54, message = "ten phai toi da 54 ki tu")
    private String service_name;

    private double service_area;

    private double service_cost;

    private int service_max_people;

    private String standard_room;
    private String description_other_convenience;
    private double pool_area;
    @Min(value = 1, message = "nhap vao so nguyen duong")
    private int number_of_floors;

    @ManyToOne(targetEntity = RentType.class)
    @JoinColumn(name = "rent_type_id", nullable = false)
    private RentType rentType;

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    @ManyToOne(targetEntity = ServiceType.class)
    @JoinColumn(name = "service_type_id", nullable = false)
    private ServiceType serviceType;

    @OneToMany(mappedBy = "service")
    Set<Contract> contractSet;

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Service() {
    }

    public Long getService_id() {
        return service_id;
    }

    public void setService_id(Long id) {
        this.service_id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public double getService_area() {
        return service_area;
    }

    public void setService_area(double service_area) {
        this.service_area = service_area;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_rom) {
        this.standard_room = standard_rom;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }
}
