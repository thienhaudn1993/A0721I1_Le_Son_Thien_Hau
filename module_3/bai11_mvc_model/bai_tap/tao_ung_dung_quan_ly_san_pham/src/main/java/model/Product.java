package model;

public class Product {
    private int id;
    private String name;
    private String brand;
    private int quatity;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String brand, int quatity, String status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.quatity = quatity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
