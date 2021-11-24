package bai_tap_lam_them.controller;

import bai_tap_lam_them.service.NotFoundVehicelException;
import bai_tap_lam_them.service.XeMayService;
import bai_tap_lam_them.service.XeOToService;
import bai_tap_lam_them.service.XeTaiService;

import java.util.Scanner;

import static case_study_furama_resort.controllers.FuramaController.scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static XeTaiService xeTaiService = new XeTaiService();
    private static XeOToService xeOToService = new XeOToService();
    private static XeMayService xeMayService = new XeMayService();
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÍ PHƯƠNG TIỆN GIAO THÔNG");
        String tmp = "";
        int choose = 0;
        do {
            System.out.println("Chọn chức năng " +
                    "\n1.Thêm mới phương tiện" +
                    "\n2.Hiện thị phương tiện" +
                    "\n3.Xóa phương tiện" +
                    "\n4.Thoát");
            System.out.println(tmp.isEmpty() ? "Nhập chức năng cần thực hiện" : "Vui lòng nhập số từ 1-4");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        } while (choose <= 0 || choose > 4);
        switch (choose) {
            case 1:
                themMoiLoaiXe();
                break;
            case 2:
                hienThiLoaiXe();
                break;
            case 3:
                xoaBienKiemSoat();
                break;
            case 4:
                System.exit(0);
                break;
        }
        backToMenu();
    }
    public static void themMoiLoaiXe(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn phương tiện cần thêm mới "+
                    "\n1.Thêm xe tải" +
                    "\n2.Thêm oto" +
                    "\n3.Thêm xe máy" );
            System.out.println(tmp.isEmpty()?"Nhập phương tiệncần thực hiện":"Vui lòng nhập số từ 1-3");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 3);
        switch (choose){
            case 1:
                xeTaiService.create();
                System.out.println("Thêm xe tải thành công");
                break;
            case 2:
                xeOToService.create();
                System.out.println("Thêm xe oTo thành công");
                break;
            case 3:
                xeMayService.create();
                System.out.println("Thêm xe máy thành công");
                break;
        }
    }
    public static void hienThiLoaiXe(){
        String tmp="";
        int choose = 0;
        do {
            System.out.println("Chọn phương tiện cần hiển thị "+
                    "\n1.Hiện thị  xe tải" +
                    "\n2.Hiện thị  oto" +
                    "\n3.Hiện thị  xe máy" );
            System.out.println(tmp.isEmpty()?"Nhập phương tiện cần thực hiện":"Vui lòng nhập số từ 1-3");
            tmp = scanner.nextLine();
            if (validateNumber(tmp)) {
                choose = Integer.parseInt(tmp);
            }
        }while (choose <= 0 || choose > 3);
        switch (choose){
            case 1:
                xeTaiService.show();
                break;
            case 2:
                xeOToService.show();
                break;
            case 3:
                xeMayService.show();
                break;
        }
    }
    public static void xoaBienKiemSoat() throws NotFoundVehicelException {
        System.out.println("Vui lòng nhập biển kiếm soat cần xóa");
        String bks = scanner.nextLine();
        if (xeMayService.searchBks(bks) || xeOToService.searchBks(bks) || xeTaiService.searchBks(bks)){
            System.out.println("Chọn Yes để xóa, chọn No để quay lại Menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "Yes":
                    xeTaiService.delete(bks);
                    xeOToService.delete(bks);;
                    xeMayService.delete(bks);
                    break;
                case "No":
                    displayMenu();
                    break;
            }
        }
        else {
            throw new NotFoundVehicelException("Biển kiểm soát không tồn tại");
        }
    backToMenu();
    }
    public static boolean validateNumber(String choose) {
        String regex = "^[1-4]$";
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
