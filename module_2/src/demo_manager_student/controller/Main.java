package demo_manager_student.controller;


import demo_manager_student.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng cần thực hiên" +
                    "\n1.add" +
                    "\n2.display" +
                    "\n3.edit" +
                    "\n4.delete"+
                    "\n5.Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.display();
                    break;
                case 3:

                case 4:

                case 5:
                    System.exit(0);
                default:
                    flag=false;
            }
        }while (flag);
    }
}
