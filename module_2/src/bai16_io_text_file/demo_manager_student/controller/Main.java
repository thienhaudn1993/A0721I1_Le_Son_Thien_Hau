package demo_manager_student.controller;

import demo_manager_student.service.StudentService;

import java.util.Scanner;

public class Main {
    static final int ADD =1;
    private static StudentService studentService = new StudentService();
    public static void main(String[] args) {
        boolean flag =true;
        do {
            System.out.println("Chọn chức năng cần thực hiên" +
                    "\n1.add" +
                    "\n2.display" +
                    "\n3.edit" +
                    "\n4.delete"+
                    "\n5.search"+
                    "\n6.Exit");
            Scanner scanner = new Scanner(System.in);
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    studentService.add();
                    //code
                    break;
                case 2:
                    //code
                    studentService.display();
                    break;
                case 3:
                    System.out.println("chức năng update");
                    studentService.edit();
                    break;
                case 4:
                    System.out.println("chức năng delete");
                    studentService.delete();
                    break;
                case 5:
                    System.out.println("chức năng search");
                    studentService.searchByName();
                    break;
                default:
                    flag=false;
            }
        }while (flag);

    }
}
