package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        /*fan2.getRadius();
        fan2.getColor();
        fan2.isOn();*/
        System.out.println(fan2.toString());
    }
}
