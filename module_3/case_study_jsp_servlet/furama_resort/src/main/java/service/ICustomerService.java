package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();


    Customer findById(String id);

    void save(int id, String name, String birthday, int gender, String customer_id_card, String phone, String email, String address);

    boolean createStudent(Customer student);

    boolean remove(Customer student);
}
