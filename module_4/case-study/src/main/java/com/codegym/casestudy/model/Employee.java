package com.codegym.casestudy.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    @NotEmpty(message = "Không được để trống")
    private String employee_name;
    @NotEmpty(message = "Không được để trống")
    private String employee_birthday;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^^([0-9]{9})|([0-9]{12})$", message = "CMND nhap khong dung")
    private String employee_id_card;
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^(090|091|(\\+8490)|(\\+8491))+[0-9]{7}$", message = "Phone nhập không hợp lệ")
//    @Pattern(regexp = "(((\\+|)|84)|0)(3|5|7|8|9)+([0-9]{8})\\b", message = "Phone nhập không hợp lệ")
    private String employee_phone;
    @NotEmpty(message = "Không được để trống")
    @Email(message = "Email nhap chua dung dinh dang")
    private String employee_email;
    @Min(value = 1, message = "Luong phai lon hon 0")
    private double employee_salary;
    @NotEmpty(message = "Không được để trống")
    private String employee_address;

    public Employee() {
    }

    @ManyToOne(targetEntity = Position.class)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class)
    @JoinColumn(name = "education_degree_id", nullable = false)
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = Devision.class)
    @JoinColumn(name = "devision_id", nullable = false)
    private Devision devision;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "username", nullable = false)
    private User user;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    Set<Contract> contractSet;

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Devision getDevision() {
        return devision;
    }

    public void setDevision(Devision devision) {
        this.devision = devision;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
}
