package demo_manager_student.service;

import demo_manager_student.model.Student;
import demo_manager_student.util.ReadAndWriterFileNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceNew {
    private static Scanner scanner = new Scanner(System.in);
    public void add(){
        System.out.println("Nhập tên SV");
        String name = scanner.nextLine();
        System.out.println("Nhập tên tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập Point");
        int point = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập môn học");
        String subject = scanner.nextLine();
        Student student = new Student(name,age,id,address,point,subject);
        List<Student> studentList = new ArrayList<>(); // do tạo danh sách rỗng add vào nên cần append:true, nếu để mặc định (false) nó sẽ ghi đè
        studentList.add(student);
        ReadAndWriterFileNew.writeStudentListToCSV(studentList,true);
    }
    public void display(){
        System.out.println("Danh sách hiển thị");
        List<Student> studentList = ReadAndWriterFileNew.readStudentListfromCSV();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i+1)+"."+studentList.get(i));
        }

    }
    public void edit(){
        display();
        System.out.println("Nhập vị trí sinh viên cần chỉnh sửa");
        int index = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = ReadAndWriterFileNew.readStudentListfromCSV();
        System.out.println("Nhập tên sv cần chính sửa");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập tuổi sv cần chính sửa");
        int ageNew = Integer.parseInt(scanner.nextLine());
        studentList.get(index-1).setName(nameNew);
        studentList.get(index-1).setAge(ageNew);
        ReadAndWriterFileNew.writeStudentListToCSV(studentList,false);

    }
    public void delete(){

        display();
        System.out.println("Nhập vị trí sv cần delete");
        int index = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = ReadAndWriterFileNew.readStudentListfromCSV();
        studentList.remove(index-1);
        ReadAndWriterFileNew.writeStudentListToCSV(studentList,false);
    }
    public void searchByName(){
        System.out.println("Nhập tên cần tìm kiếm");
        String nameSearch = scanner.nextLine();
        List<Student> studentList = ReadAndWriterFileNew.readStudentListfromCSV();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(nameSearch)){
                System.out.println(studentList.get(i));
            }
        }
    }
}
