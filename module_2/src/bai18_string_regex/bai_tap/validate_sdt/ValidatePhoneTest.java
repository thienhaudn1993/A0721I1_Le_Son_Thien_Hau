package bai18_string_regex.bai_tap.validate_sdt;

import java.util.Scanner;

public class ValidatePhoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone="";
        System.out.println("Nhập số phone");
        phone = scanner.nextLine();
        ValidatePhone validatePhone = new ValidatePhone();
        boolean checkPhone = validatePhone.validatePhoneNumber(phone);
        if (checkPhone){
            System.out.println("Phone hợp lệ");
        }else {
            System.out.println("Phone không hợp lệ");
        }
    }
}
