package bai18_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class RegularExpressionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String className ="";
        className = scanner.nextLine();
        RegularExpression regularExpression = new RegularExpression();
        boolean check = regularExpression.validate(className);
        if (check){
            System.out.println("Tên lớp hợp lệ");
        }else {
            System.out.println("Tên lớp không hợp lệ");
        }

    }
}
