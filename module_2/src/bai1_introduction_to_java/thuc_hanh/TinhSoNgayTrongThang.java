package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày của tháng "+month);
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày của tháng "+month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày của tháng "+month);
                break;
            default:
                System.out.println("Số nhập vào vô nghĩa");
                break;
        }
    }
}
