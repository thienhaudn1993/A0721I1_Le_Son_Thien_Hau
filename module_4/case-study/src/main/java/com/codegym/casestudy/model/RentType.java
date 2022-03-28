package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rent_type_id;
    private String rent_type_name;
    private double rent_type_price;

    @OneToMany(mappedBy = "rentType")
    Set<Service> services;

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public RentType() {
    }

    public Long getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(Long id) {
        this.rent_type_id = id;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public double getRent_type_price() {
        return rent_type_price;
    }

    public void setRent_type_price(double rent_type_price) {
        this.rent_type_price = rent_type_price;
    }
}
