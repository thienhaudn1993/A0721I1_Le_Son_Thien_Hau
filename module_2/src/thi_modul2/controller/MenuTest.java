package thi_modul2.controller;

import thi_modul2.service.GenuinePhoneService;
import thi_modul2.service.HandlePhoneService;
import thi_modul2.service.NotFoundProductException;

import java.util.Scanner;

public class MenuTest {
    private static Scanner scanner = new Scanner(System.in);
    private static GenuinePhoneService genuinePhoneService = new GenuinePhoneService();
    private static HandlePhoneService handlePhoneService = new HandlePhoneService();
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI ");
        String tmp = "";
        int choose = 0;
        do {
            System.out.println("Chọn chức năng theo số " +
                    "\n1.Thêm mới " +
                    "\n2.Xóa" +
                    "\n3.Xem danh sách điện thoại" +
                    "\n4.Tìm kiếm" +
                    "\n5.Thoát");
            System.out.println(tmp.isEmpty() ? "Nhập chức năng cần thực hiện" : "Vui lòng nhập số từ 1-5");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        } while (choose <= 0 || choose > 5);
        switch (choose) {
            case 1:
                createPhone();
                break;
            case 2:
                deletePhone();
                break;
            case 3:
                showPhone();
                break;
            case 4:
                searchPhone();
                break;
            case 5:
                System.exit(0);
                break;
        }
        backToMenu();
    }
    public static void createPhone(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần tạo: "+
                    "\n1.GenuinePhone" +
                    "\n2.HandlePhone" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
               genuinePhoneService.create();
                break;
            case 2:
                handlePhoneService.create();
                break;
        }
    }
    public static void deletePhone()  {
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần xóa: "+
                    "\n1.GenuinePhone" +
                    "\n2.HandlePhone" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                genuinePhoneService.delete();
                break;
            case 2:
                handlePhoneService.delete();
                break;
        }
    }
    public static void showPhone(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần hiển thị: "+
                    "\n1.GenuinePhone" +
                    "\n2.HandlePhone" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                genuinePhoneService.show();
                break;
            case 2:
                handlePhoneService.show();
                break;
        }
    }
    public static void searchPhone(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn đối tượng cần search: "+
                    "\n1.GenuinePhone" +
                    "\n2.HandlePhone" );
            System.out.println(tmp.isEmpty()?"Nhập đối tượng cần thực hiện":"Vui lòng nhập số từ 1-2");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 2);
        switch (choose){
            case 1:
                genuinePhoneService.searchByName();
                break;
            case 2:
                handlePhoneService.searchByName();
                break;
        }
    }
    public static boolean validateNumber(String choose) {
        String regex = "^[1-5]$";
        return choose.matches(regex);
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
}
