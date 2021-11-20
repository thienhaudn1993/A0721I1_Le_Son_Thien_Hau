//package demo_manager_student.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import bai16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat.ReadAndWriteFile;
//import demo_manager_student.model.Student;
//import demo_manager_student.util.ReadAndWriteFile;
//
//// import nó mới có thể khởi tạo biến có KDL studentList
//public class StudentService {
//    private Scanner scanner = new Scanner(System.in);
//    public static ArrayList<Student> studentList = new ArrayList<>();
//    static{
//        studentList.add(new Student("Hau1",28,1,"DN",75,"Math"));
//        studentList.add(new Student("Hau2",27,2,"DN",80,"History"));
//        studentList.add(new Student("Hau3",26,3,"DN",100,"Physic"));
//    }
//    // add, edit, delete, display inf student
//    public void add(){
//        System.out.println("Nhập tên SV");
//        String name = scanner.nextLine();
//        System.out.println("Nhập tên tuổi");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập địa chỉ");
//        String address = scanner.nextLine();
//        System.out.println("Nhập Point");
//        int point = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập môn học");
//        String subject = scanner.nextLine();
//        Student student = new Student(name,age,id,address,point,subject);
//        //Tạo 1 list rỗng ( khuyển cáo k tạo list của static ở dòng 9 )
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        ReadAndWriteFile.writeStudentListToCSV(studentList,true);
//    }
//    public void display(){
//        System.out.println("Hiển danh sách SV");
//        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
//        /*for (Student student:studentList) {
//            if (student!=null){
//                System.out.println(student.toString());
//            }
//            else {
//                break;
//            }
//        }*/
//        for (int i=0;i<studentList.size();i++){
//            System.out.println((i+1)+"."+studentList.get(i));
//        }
//        //code
//    }
//    public void delete(){
//        display();
//        System.out.println("nhập sinh viên cần xóa");
//        int  index = Integer.parseInt(scanner.nextLine());
//        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
//        studentList.remove(index-1);
//        ReadAndWriteFile.writeStudentListToCSV(studentList,false);
////        for (int i=0;i<studentList.length;i++){
////            if (id == studentList[i].getId()){
////                for (int j=i;j<studentList.length-1;j++){
////                    studentList[j]=studentList[j+1];
////                }
////                break;
////            }
////
////        }
//
//
//
//
//    }
//    public void edit(){
//    display();
//        System.out.println("Chọn sinh viên cần chỉnh sửa");
//        int  index = Integer.parseInt(scanner.nextLine());
//        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
//        System.out.println("Nhập tên cần sửa");
//        String nameNew = scanner.nextLine();
//        studentList.get(index-1).setName(nameNew);
//        ReadAndWriteFile.writeStudentListToCSV(studentList,false);
//    }
//    public void searchByName(){
//        System.out.println("Nhập tên cần tìm kiếm");
//        String searchName = scanner.nextLine();
//        List<Student> studentList = ReadAndWriteFile.readStudentListFromCSV();
//        for (Student student:studentList) {
//            if (student.getName().contains(searchName)){
//                System.out.println(student.toString());
//            }
//        }
//    }
//}
