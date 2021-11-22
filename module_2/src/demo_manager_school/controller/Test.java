package demo_manager_school.controller;

import demo_manager_school.model.Student;
import demo_manager_school.service.StudentService;

import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
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
                createForTeacherOrStudent();
                break;
            case 2:
                studentService.show();
                break;
            case 3:
                studentService.edit();
                break;
            case 4:
                studentService.delete();
                break;
            case 5:
                studentService.searchByName();
                break;
            case 6:
                studentService.searchByAge();
                break;
            case 7:
                studentService.sort();
                break;
            case 8:
                System.exit(0);
                break;
        }
        backToMenu();
    }
    public static void createForTeacherOrStudent(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần tạo "+
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
                break;
        }
    }

    public static void backToMenu(){
        System.out.println("Bạn có muốn quay lại menu (Y/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")){
            displayMenu();
        } else {
            System.exit(0);
        }
    }

    public static boolean validateNumber(String choose){
        String regex = "^[1-8]$";
        return choose.matches(regex);
    }

}
