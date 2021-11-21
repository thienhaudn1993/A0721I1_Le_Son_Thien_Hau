package demo_manager_school.service;

import demo_manager_school.model.Student;
import demo_manager_school.model.Teacher;
import demo_manager_school.util.CSVHepler;

import java.util.*;

public class TeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private CSVHepler<Teacher> teacherCSVHepler = new CSVHepler<>();
    private final String path ="src/demo_manager_school/data/teacher.csv";

    public TeacherService() {
        teacherList = getAll();
    }

    public List<Teacher> getAll(){
        teacherList.clear();
        List<String> lines = teacherCSVHepler.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],(arr[4]));
            teacherList.add(teacher);
        }
        return teacherList;
    }

    public void save(Teacher teacher){
        if (teacher.getId()>0){
            //edit
            int index = teacherList.indexOf(teacher);
            teacherList.set(index, teacher);
        } else {
            //add
            teacher.setId(teacherList.size()+1);
            teacherList.add(teacher);
        }
        teacherCSVHepler.write(teacherList,path);
    }

    public void inputAndSave(int id){
        boolean check;
        String name;
        do {
            System.out.println("Nhập tên Teacher (viết hoa chữ cái đầu) ");
             name = scanner.nextLine();
             check = name.matches("^[A-Z][a-z0-9]+$");
        }while (!check);

        System.out.println("Nhập tuổi Teacher");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập lương Teacher");
        String salary = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,age,address,salary);
        save(teacher);
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
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()){
                teacherList.remove(i);
            }
        }
        teacherCSVHepler.write(teacherList, path);
    }
    public void delete(){
        show();
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        delete(id);
        System.out.println("Bạn đã xóa thành công");
    }

    public void show(List<Teacher> teacherList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "AGE", "ADDRESS", "SALARY");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Teacher teacher:teacherList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s%n", teacher.getId(), teacher.getName(), teacher.getAge(), teacher.getAddress(), teacher.getSalary());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(teacherList);
    }
    public void searchByName(){
        System.out.println("Nhập tên Teacher cần tìm kiếm");
        String name = scanner.nextLine();
        for (Teacher teacher:teacherList) {
            if (teacher.getName().contains(name)){
                System.out.println(teacher.teacherInf());
            }
        }
    }

    public void searchByAge(){
        System.out.println("Nhập tuổi cần tìm kiếm");
        int age = Integer.parseInt(scanner.nextLine());
        for (Teacher teacher:teacherList) {
            if (teacher.getAge()==age){
                System.out.println(teacher.teacherInf());
            }
        }
    }
    public void sort(){
        Collections.sort(teacherList, Comparator.comparing(Teacher::getName));
        show();
        System.out.println("Đã sắp xếp theo tên thành công");
    }
}
