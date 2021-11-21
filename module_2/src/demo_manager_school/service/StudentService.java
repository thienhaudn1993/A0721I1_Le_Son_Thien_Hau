package demo_manager_school.service;

import demo_manager_school.model.Student;
import demo_manager_school.util.CSVHepler;

import java.awt.font.FontRenderContext;
import java.util.*;

public class StudentService {
    private static List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private CSVHepler<Student> studentCSVHepler = new CSVHepler<>();
    private final String path ="src/demo_manager_school/data/student.csv";

    public StudentService() {
        studentList = getAll();
    }

    public List<Student> getAll(){
        studentList.clear();
        List<String> lines = studentCSVHepler.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            Student student1 = new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],Double.parseDouble(arr[4]),arr[5]);
            studentList.add(student1);
        }
        return studentList;
    }

    public void save(Student student){
        if (student.getId()>0){
            //edit
            int index = studentList.indexOf(student);
            studentList.set(index, student);
        } else {
            //add
            student.setId(studentList.size()+1);
            studentList.add(student);
        }
        studentCSVHepler.write(studentList,path);
    }

    public void inputAndSave(int id){
        System.out.println("Nhập tên SV");
        String name = scanner.nextLine();
        System.out.println("Nhập tên tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập Point");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập môn học");
        String subject = scanner.nextLine();
        Student student = new Student(id,name,age,address,point,subject);
        save(student);
    }
    public void create(){
        inputAndSave(0);
        System.out.println("Đã tạo thành công");

    }
    public void edit(){
        show();
        System.out.println("Nhập id bạn muốn edit");
        int id = Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
        System.out.println("Chỉnh sửa thành công");

    }

     public void delete(int id){
         for (int i = 0; i < studentList.size(); i++) {
             if (id == studentList.get(i).getId()){
                 studentList.remove(i);
             }
         }
         studentCSVHepler.write(studentList, path);
    }
    public void delete(){
        show();
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        delete(id);
        System.out.println("Bạn đã xóa thành công");
    }

     public void show(List<Student> studentList){
         System.out.println("--------------------------------------------------------------------------------------------------------");
         System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "AGE", "ADDRESS", "POINT", " SUBJECT");
         System.out.println("--------------------------------------------------------------------------------------------------------");
         for (Student student:studentList) {
             System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getPoint(), student.getSubject());
         }
         System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(studentList);
    }
    public void searchByName(){
        System.out.println("Nhập tên cần tìm kiếm");
        String name = scanner.nextLine();
        for (Student student:studentList) {
            if (student.getName().contains(name)){
                System.out.println(student.studentInf());
            }
        }
    }

    public void searchByAge(){
        System.out.println("Nhập tuổi cần tìm kiếm");
        int age = Integer.parseInt(scanner.nextLine());
        for (Student student:studentList) {
            if (student.getAge()==age){
                System.out.println(student.studentInf());
            }
        }
    }
    public void sort(){
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        show();
        System.out.println("Đã sắp xếp theo tên thành công");
    }
}
