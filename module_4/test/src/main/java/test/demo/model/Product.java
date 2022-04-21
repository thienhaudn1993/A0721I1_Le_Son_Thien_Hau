package test.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = " Khong duoc de trong")
    @Pattern(regexp = "^^PT-[0-9]{5}$$", message = "Name Id có định dạng là PT-XXXX (X là số từ 0-9)")
    private String nameId;
    @NotEmpty(message = " Khong duoc de trong")
    private String name;
    @Min(value = 1, message = "price phai lon hon 0")
    private double price;
    @NotEmpty(message = " Khong duoc de trong")
    private String status;
    @ManyToOne(targetEntity = Category.class)
    Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
