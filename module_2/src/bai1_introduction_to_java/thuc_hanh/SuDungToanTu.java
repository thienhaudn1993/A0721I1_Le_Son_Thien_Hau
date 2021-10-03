package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập weight");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập height");
        height = Float.parseFloat(scanner.nextLine());
        float area = weight*height;
        System.out.println("Dien tich la "+area);
    }
}
