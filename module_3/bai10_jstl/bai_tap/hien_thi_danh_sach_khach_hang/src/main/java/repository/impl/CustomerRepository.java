package repository.impl;

import model.Customer;
import repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_640.png"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_640.png"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_640.png"));
        customerList.add(new Customer("Trần Đăng Khoa   ","1983-08-27","Hà Tây","https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_640.png"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_640.png"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
