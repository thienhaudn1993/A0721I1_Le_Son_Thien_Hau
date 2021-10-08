package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double getDiscriminant = quadraticEquation.getDiscriminant();
        System.out.println("GetDiscriminant là: "+getDiscriminant);
        double getRoot1;
        double getRoot2;
        if (getDiscriminant>0){
            getRoot1 = quadraticEquation.getRoot1();
            getRoot2 = quadraticEquation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm là: "+getRoot1+ " và "+getRoot2);
        }
        else if (getDiscriminant==0){
            getRoot1=quadraticEquation.getRoot1();
            System.out.println("Phương trình có 2 nghiệm bằng nhau là: "+getRoot1);
        }
        else {
            System.out.println("Phương trình không có nghiệm");
        }

    }
}
