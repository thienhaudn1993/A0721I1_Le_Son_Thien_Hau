package case_study_furama_resort.services.impl;

import case_study_furama_resort.models.Employee;
import case_study_furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập ID nhân viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND nhân viên");
        String cmnd = scanner.nextLine();
        System.out.println("Nhập phone nhân viên");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email nhân viên");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên");
        String levelGrade = scanner.nextLine();
        System.out.println("Nhập vị trí job của nhân viên");
        String jobPosition = scanner.nextLine();
        System.out.println("Nhập lương nhân viên");
        double salary = Double.parseDouble(scanner.nextLine());
        employeeList.add(new Employee(id, name, age, gender, cmnd, phone, email, levelGrade, jobPosition, salary));
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhập id nhân viên cần chỉnh sửa");
        String id = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getId()).equals(id)) {
                System.out.println("Nhập ID nhân viên mới");
                String idEdit = scanner.nextLine();
                System.out.println("Nhập tên nhân viên cần sửa");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi nhân viên cần sửa");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính nhân viên cần sửa");
                String gender = scanner.nextLine();
                System.out.println("Nhập CMND nhân viên cần sửa");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập phone nhân viên cần sửa");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email nhân viên cần sửa");
                String email = scanner.nextLine();
                System.out.println("Nhập trình độ nhân viên cần sửa");
                String levelGrade = scanner.nextLine();
                System.out.println("Nhập vị trí job của nhân viên cần sửa");
                String jobPosition = scanner.nextLine();
                System.out.println("Nhập lương nhân viên cần sửa");
                double salary = Double.parseDouble(scanner.nextLine());
                employeeList.add(i, new Employee(idEdit, name, age, gender, cmnd, phone, email, levelGrade, jobPosition, salary));
                employeeList.remove(i+1);
                check=true;
            }
        }
        if (!check) {
            System.out.println("id nhập vào bị sai");
        }
    }

    @Override
    public void delete() {

    }
}
