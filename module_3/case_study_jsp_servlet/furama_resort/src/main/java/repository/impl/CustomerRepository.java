package repository.impl;

import model.Customer;
import repository.ICustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomer_id(resultSet.getInt("customer_id"));
                customer.setCustomer_name(resultSet.getString("customer_name"));
                customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer.setCustomer_gender(resultSet.getInt("customer_gender"));
                customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer.setCustomer_phone(resultSet.getString("customer_phone"));
                customer.setCustomer_email(resultSet.getString("customer_email"));
                customer.setCustomer_address(resultSet.getString("customer_address"));
                customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer where customer_id=?");
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomer_id(resultSet.getInt("customer_id"));
                customer.setCustomer_name(resultSet.getString("customer_name"));
                customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer.setCustomer_gender(resultSet.getInt("customer_gender"));
                customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer.setCustomer_phone(resultSet.getString("customer_phone"));
                customer.setCustomer_email(resultSet.getString("customer_email"));
                customer.setCustomer_address(resultSet.getString("customer_address"));
                customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
                break;
            }
            return customer;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(String id, String name, String email, String address) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update customer set customer_name=?, customer_email=?, customer_address=? where customer_id=?");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,address);
            preparedStatement.setInt(4, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into customer (customer_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,customer.getCustomer_id()); // nếu bên mySQL để customer_id là auto_increment thì sẽ k gặp lỗi exception
            preparedStatement.setString(2,customer.getCustomer_name());
            preparedStatement.setString(3,customer.getCustomer_birthday());
            preparedStatement.setInt(4,customer.getCustomer_gender());
            preparedStatement.setString(5,customer.getCustomer_id_card());
            preparedStatement.setString(6,customer.getCustomer_phone());
            preparedStatement.setString(7,customer.getCustomer_email());
            preparedStatement.setString(8,customer.getCustomer_address());
            preparedStatement.setInt(9,customer.getCustomer_type_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from customer where customer_id=?");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from customer where customer_name like ?");
            preparedStatement.setString(1,"%"+name+"%");
            Customer customer;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomer_id(resultSet.getInt("customer_id"));
                customer.setCustomer_name(resultSet.getString("customer_name"));
                customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer.setCustomer_gender(resultSet.getInt("customer_gender"));
                customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer.setCustomer_phone(resultSet.getString("customer_phone"));
                customer.setCustomer_email(resultSet.getString("customer_email"));
                customer.setCustomer_address(resultSet.getString("customer_address"));
                customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

}
