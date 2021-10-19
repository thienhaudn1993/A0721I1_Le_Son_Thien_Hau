package demo_manager_student.service;

import java.util.Scanner;
import demo_manager_student.model.Student;
// import nó mới có thể khởi tạo biến có KDL studentList
public class StudentService {
    private Scanner scanner = new Scanner(System.in);
    public static Student[] studentList = new Student[100];
    static{
        studentList[0]=new Student("Hau1",28,1,"DN",75,"Math");
        studentList[1]=new Student("Hau2",27,2,"DN",80,"History");
        studentList[2]=new Student("Hau3",26,3,"DN",100,"Physic");
    }
    // add, edit, delete, display inf student
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
        for (int i=0;i<studentList.length;i++){
            if (studentList[i]==null){
                studentList[i]=student;
                break;
            }
        }
    }
    public void display(){
        System.out.println("Hiển danh sách SV");
        for (Student student:studentList) {
            if (student!=null){
                System.out.println(student.toString());
            }
            else {
                break;
            }
        }
    }
    public void delete(){
    //
    }
    public void edit(){
    //
    }
}
