package demo_manager_school.controller;

import demo_manager_school.model.Student;
import demo_manager_school.service.StudentService;
import demo_manager_school.service.TeacherService;

import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
    private static TeacherService teacherService = new TeacherService();
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Các chức năng cần thực hiện "+
                    "\n1.add" +
                    "\n2.display" +
                    "\n3.edit" +
                    "\n4.delete"+
                    "\n5.searchByName"+
                    "\n6.searchByAge"+
                    "\n7.sortByName"+
                    "\n8.Exit");
            System.out.println(tmp.isEmpty()?"Nhập chức năng cần thực hiện":"Vui lòng nhập số từ 1-8");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 8);
        switch (choose){
            case 1:
                createTeacherOrStudent();
                break;
            case 2:
                displayTeacherOrStudent();
                break;
            case 3:
                editTeacherOrStudent();
                break;
            case 4:
                deleteTeacherOrStudent();
                break;
            case 5:
                searchByNameTeacherOrStudent();
                break;
            case 6:
                searchByAgeTeacherOrStudent();
                break;
            case 7:
                sortTeacherOrStudent();
                break;
            case 8:
                System.exit(0);
                break;
        }
        backToMenu();
    }
    public static void createTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần tạo: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.create();
                break;
            case 2:
                teacherService.create();
                break;
        }
    }

    public static void displayTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần hiển thị: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.show();
                break;
            case 2:
                teacherService.show();
                break;
        }
    }

    public static void editTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần chỉnh sửa "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.edit();
                break;
            case 2:
                teacherService.edit();
                break;
        }
    }

    public static void deleteTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần xóa: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.delete();
                break;
            case 2:
                teacherService.delete();
                break;
        }
    }

    public static void searchByNameTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần tìm kiếm theo tên: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.searchByName();
                break;
            case 2:
                teacherService.searchByName();
                break;
        }
    }

    public static void searchByAgeTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần tìm kiếm theo tuổi: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.searchByAge();
                break;
            case 2:
                teacherService.searchByAge();
                break;
        }
    }
    public static void sortTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần sắp xếp: "+
                    "\n1.Student" +
                    "\n2.Teacher" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                studentService.sort();
                break;
            case 2:
                teacherService.sort();
                break;
        }
    }
    public static void backToMenu(){
        System.out.println("Bạn có muốn quay lại menu (Y/N): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")){
            displayMenu();
        } else {
            System.exit(0);
        }
    }
///dsdsdsdsds
//    ssdsdsd/asdasdasd/asdsad
    public static boolean validateNumber(String choose){
        String regex = "^[1-8]$";
        return choose.matches(regex);
    }

}
