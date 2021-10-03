package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter USD");
        usd=sc.nextDouble();
        double quiDoi= usd*23000;
        System.out.println("VND is "+quiDoi);
    }
}
