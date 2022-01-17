package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public void save(int id, String name, String birthday, int gender, String customer_id_card, String phone, String email, String address) {

    }

    @Override
    public boolean createStudent(Customer student) {
        return false;
    }

    @Override
    public boolean remove(Customer student) {
        return false;
    }
}
