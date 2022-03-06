package com.codegym.validateinforuser.model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 2, max = 30, message = "tên cần nhập từ 2 đến 30 kí tự")
    private String name;

    @Min(value = 18, message = "Bạn cần nhập số tuổi từ 18 trở lên")
    private int age;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 30) String name, @Size(min = 18) int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
