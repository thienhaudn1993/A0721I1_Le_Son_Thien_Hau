package case_study_furama_resort.controllers;

import case_study_furama_resort.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng cần thực hiện" +
                    "\n1.Employee Management"+
                    "\n2.Customer Management"+
                    "\n3.Facility Management "+
                    "\n4.Booking Management"+
                    "\n5.Promotion Management"+
                    "\n6.Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }while (flag);
    }
    public static void displayEmployeeManagement() {
        boolean flag = true;
        EmployeeServiceImpl employeeServiceimpl = new EmployeeServiceImpl();
        do {
            System.out.println(
                    "\n1.Display list employees" +
                            "\n2.Add new employee" +
                            "\n3.Edit employee " +
                            "\n4.Return main menu");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    employeeServiceimpl.display();
                    break;
                case 2:
                    employeeServiceimpl.add();
                    break;
                case 3:
                    employeeServiceimpl.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }while (flag);
    }
    public static void displayCustomerManagement(){
        boolean flag=true;
        do {
            System.out.println(
                            "\n1.Display list customers"+
                            "\n2.Add new customer"+
                            "\n3.Edit customer "+
                            "\n4.Return main menu");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }while (flag);
    }
    public static void displayFacilityManagement(){
        boolean flag=true;
        do {
            System.out.println(
                            "\n1.Display list facility"+
                            "\n2.Add new facility"+
                            "\n3.Display list facility maintenance "+
                            "\n4.Return main menu");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }while (flag);
    }
    public static void displayBookingManagement(){
        boolean flag=true;
        do {
            System.out.println(
                            "\n1.Add new booking"+
                            "\n2.Display list booking"+
                            "\n3.Create new constracts"+
                            "\n4.Display list contracts"+
                            "\n5.Edit contracts"+
                            "\n6.Return main menu");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        }while (flag);
    }
    public static void displayPromotionManagement(){
        boolean flag=true;
        do {
            System.out.println(
                    "\n1.Display list customers use service"+
                            "\n2.Display list customers get voucher"+
                            "\n3.Return main menu ");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (flag);
    }
}
