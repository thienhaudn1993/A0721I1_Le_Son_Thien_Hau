package com.codegym.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;
    @NotEmpty(message = "Không được để trống")
    private String customer_name;
    @NotEmpty(message = "Không được để trống")
    private String customer_birthday;
    @NotEmpty(message = "Không được để trống")
    private String customer_gender;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^^([0-9]{9})|([0-9]{12})$$", message = "CMND nhap khong dung")
    private String customer_id_card;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^(090|091|(\\+8490)|(\\+8491))+[0-9]{7}$", message = "Phone nhập không hợp lệ")
    private String customer_phone;
    @NotEmpty(message = "Không được để trống")
    @Email(message = "email chua dung")
    private String customer_email;
    @NotEmpty(message = "Không được để trống")
    private String customer_address;
    @ManyToOne(targetEntity = CustomerType.class)
    @JoinColumn(name="customer_type_id", nullable=false)
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    Set<Contract> contractSet;

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer() {
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(String customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(String customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
