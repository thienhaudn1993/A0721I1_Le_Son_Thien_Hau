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
        return iCustomerRepository.findById(id);
    }

    @Override
    public void save(String id, String name, String email, String address) {
         iCustomerRepository.save(id,name,email,address);
    }


    @Override
    public boolean createCustomer(Customer customer) {
        Customer customer1 =  findById(String.valueOf(customer.getCustomer_id()));
        if (customer1 != null) {
            return false;
        }
        else {
            iCustomerRepository.createCustomer(customer);
            return true;
        }
    }

    @Override
    public boolean remove(String id) {
        Customer customer1 =  findById(id);
        if (customer1 == null) {
            return false;
        }else {
            iCustomerRepository.remove(id);
            return true;
        }
    }

    @Override
    public List<Customer> findByName(String name) {
        return iCustomerRepository.findByName(name);
    }


}
