package bai3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "haulehaulebkdanang";
        System.out.println("Chuỗi cho sẵn là:");
        System.out.println(str);
        System.out.println("Nhập kí tự mà bán muốn đếm");
        String nhapKiTu = scanner.nextLine();
        int count =0;
        for (int i=0;i<str.length();i++){
            if (nhapKiTu.charAt(0)==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự "+nhapKiTu+" là: "+count);
    }
}
