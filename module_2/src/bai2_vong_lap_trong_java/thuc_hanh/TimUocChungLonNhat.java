package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        a=scanner.nextInt();
        System.out.println("Nhap b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.println("No greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số a và b là "+a);
    }
}
