package demo_manager_student.service;


import demo_manager_student.model.Student;
import demo_manager_student.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IService {
    private Scanner scanner = new Scanner(System.in);

    // bỏ static khi đọc ghi file
//    public static List<Student> studentList = new LinkedList<>();
//    static {
//        studentList.add(new Student(1,"chanh1",23,"DN",5,"Toán"));
//        studentList.add(new Student(2,"chanh2",23,"DN",5,"Toán"));
//        studentList.add(new Student(3,"chanh3",23,"DN",5,"Toán"));
//        studentList.add(new Student(4,"chanh4",23,"DN",5,"Toán"));
//        studentList.add(1,new Student(5,"chanh4",23,"DN",5,"Toán"));
//    }
    // them, sưa, xóa, hien thi thông tin student
    @Override
    public void add(){
        /// code thêm mới
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập môn học");
        String subject = scanner.nextLine();
        System.out.println("nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id,name,age,address,point,subject);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        ReadAndWriteFile.writeStudentListToCSV(studentList,true);
    }
    @Override
    public void display(){
        System.out.println("hiên thi ra danh sách");
        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
        for (int i=0;i<studentList.size();i++){
            System.out.println((i+1)+"."+studentList.get(i));
        }
    }

    @Override
    public void delete(){
        display();
        System.out.println("chọn sinh viên cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
        studentList.remove(index-1);
        ReadAndWriteFile.writeStudentListToCSV(studentList,false);
    }
    @Override
    public void edit(){
        display();
        System.out.println("chọn sinh viên cần edit");
        int index = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
        System.out.println("nhập tên cần sửa");
        String nameNew= scanner.nextLine();
        studentList.get(index-1).setName(nameNew);
        ReadAndWriteFile.writeStudentListToCSV(studentList,false);
    }
    public void searchByName(){
        System.out.println("nhập tên cần tìm kiếm");
        String searchName = scanner.nextLine();
        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
        for (Student student: studentList){
           if (student.getName().contains(searchName)){// tìm kiếm gần đúng
               System.out.println(student.toString());
           }
        }
    }
}
