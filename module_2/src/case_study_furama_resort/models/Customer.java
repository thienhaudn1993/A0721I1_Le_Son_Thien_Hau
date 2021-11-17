package case_study_furama_resort.models;

public class Customer extends People {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, int age, String gender, String cmnd, int phone, String email, String typeCustomer, String address) {
        super(id, name, age, gender, cmnd, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
