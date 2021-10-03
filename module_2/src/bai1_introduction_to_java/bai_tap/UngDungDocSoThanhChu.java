package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc ");
        int nhap = sc.nextInt();
        if (nhap<0 || nhap>999){
            System.out.println("Vui lòng nhập số từ 0 đến 999 ");
        }
        else if (nhap<10){

        }
    }
}
