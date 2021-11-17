package case_study_furama_resort.services.impl;

import case_study_furama_resort.models.Customer;
import case_study_furama_resort.models.Employee;
import case_study_furama_resort.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer:customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập ID khách hàng");
        String id = scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi khách hàng");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính khách hàng");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND khách hàng");
        String cmnd = scanner.nextLine();
        System.out.println("Nhập phone khách hàng");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email khách hàng");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        customerList.add(new Customer(id,name,age,gender,cmnd,phone,email,typeCustomer,address));
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhập id khách hàng cần chỉnh sửa");
        String id = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                System.out.println("Nhập ID khách hàng cần sửa");
                String idEdit = scanner.nextLine();
                System.out.println("Nhập tên khách hàng cần sửa");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi khách hàng cần sửa");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính khách hàng cần sửa");
                String gender = scanner.nextLine();
                System.out.println("Nhập CMND khách hàng cần sửa");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập phone khách hàng cần sửa");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email khách hàng cần sửa");
                String email = scanner.nextLine();
                System.out.println("Nhập loại khách hàng cần sửa");
                String typeCustomer = scanner.nextLine();
                System.out.println("Nhập địa chỉ khách hàng cần sửa");
                String address = scanner.nextLine();
                Customer customer = new Customer(idEdit,name,age,gender,cmnd,phone,email,typeCustomer,address);
                customerList.add(i,customer);
                customerList.remove(i+1);
            }
        }
    }

    @Override
    public void delete() {

    }
}
