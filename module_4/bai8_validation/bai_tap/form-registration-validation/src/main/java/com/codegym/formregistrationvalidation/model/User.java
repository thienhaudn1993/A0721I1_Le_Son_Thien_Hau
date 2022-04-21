package com.codegym.formregistrationvalidation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài phải từ 5 đến 45 kí tự")
    private String firstName;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài phải từ 5 đến 45 kí tự")
    private String lastName;

    @Pattern(regexp = "^(09|03|07|08|05)+[0-9]{8}$", message = "Phone nhập không hợp lệ")
    private String phone;

    @Min(value = 18, message = "Tuổi nhập cần từ 18 tuổi trở lên")
    private int age;

    @Email(message = "Định dạng email nhập không hợp lệ")
    private String email;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
