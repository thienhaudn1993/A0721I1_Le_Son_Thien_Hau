package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setEmployee_id(resultSet.getInt("employee_id"));
                employee.setEmployee_name(resultSet.getString("employee_name"));
                employee.setEmployee_birthday(resultSet.getString("employee_birthday"));
                employee.setEmployee_id_card(resultSet.getString("employee_id_card"));
                employee.setEmployee_salary(resultSet.getDouble("employee_salary"));
                employee.setEmployee_phone(resultSet.getString("employee_phone"));
                employee.setEmployee_email(resultSet.getString("employee_email"));
                employee.setEmployee_address(resultSet.getString("employee_address"));
                employee.setPosition_id(resultSet.getInt("position_id"));
                employee.setEducation_degree_id(resultSet.getInt("education_degree_id"));
                employee.setDivision_id(resultSet.getInt("division_id"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee findById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where employee_id=?");
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setEmployee_id(resultSet.getInt("employee_id"));
                employee.setEmployee_name(resultSet.getString("employee_name"));
                employee.setEmployee_birthday(resultSet.getString("employee_birthday"));
                employee.setEmployee_id_card(resultSet.getString("employee_id_card"));
                employee.setEmployee_salary(resultSet.getDouble("employee_salary"));
                employee.setEmployee_phone(resultSet.getString("employee_phone"));
                employee.setEmployee_email(resultSet.getString("employee_email"));
                employee.setEmployee_address(resultSet.getString("employee_address"));
                employee.setPosition_id(resultSet.getInt("position_id"));
                employee.setEducation_degree_id(resultSet.getInt("education_degree_id"));
                employee.setDivision_id(resultSet.getInt("division_id"));
                break;
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into employee (employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id) values (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,employee.getEmployee_name());
            preparedStatement.setString(2,employee.getEmployee_birthday());
            preparedStatement.setString(3,employee.getEmployee_id_card());
            preparedStatement.setDouble(4,employee.getEmployee_salary());
            preparedStatement.setString(5,employee.getEmployee_phone());
            preparedStatement.setString(6,employee.getEmployee_email());
            preparedStatement.setString(7,employee.getEmployee_address());
            preparedStatement.setInt(8,employee.getPosition_id());
            preparedStatement.setInt(9,employee.getEducation_degree_id());
            preparedStatement.setInt(10,employee.getDivision_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(String id, String name, String email, String address) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update employee set employee_name=?,employee_email=?,employee_address=?  where employee_id=? ;");
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
    public void remove(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from employee where employee_id =?");
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> search(String name, String email, String divisionId) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where employee_name like ? and employee_email like ? and division_id like ?");
            String name1 = "%"+name+"%";
            String email1 = "%"+email+"%";
            String divisionId1 = "%"+divisionId+"%";
            preparedStatement.setString(1, name1);
            preparedStatement.setString(2, email1);
            preparedStatement.setString(3, divisionId1);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setEmployee_id(resultSet.getInt("employee_id"));
                employee.setEmployee_name(resultSet.getString("employee_name"));
                employee.setEmployee_birthday(resultSet.getString("employee_birthday"));
                employee.setEmployee_id_card(resultSet.getString("employee_id_card"));
                employee.setEmployee_salary(resultSet.getDouble("employee_salary"));
                employee.setEmployee_phone(resultSet.getString("employee_phone"));
                employee.setEmployee_email(resultSet.getString("employee_email"));
                employee.setEmployee_address(resultSet.getString("employee_address"));
                employee.setPosition_id(resultSet.getInt("position_id"));
                employee.setEducation_degree_id(resultSet.getInt("education_degree_id"));
                employee.setDivision_id(resultSet.getInt("division_id"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
