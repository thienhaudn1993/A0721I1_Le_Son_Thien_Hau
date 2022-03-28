package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_type_id;
    private String service_type_name;
    @OneToMany(mappedBy = "serviceType")
    Set<Service> services;

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public ServiceType() {
    }

    public Long getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(Long id) {
        this.service_type_id = id;
    }

    public String getService_type_name() {
        return service_type_name;
    }

    public void setService_type_name(String service_type_name) {
        this.service_type_name = service_type_name;
    }
}
