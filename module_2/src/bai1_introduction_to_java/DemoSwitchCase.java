package bai1_introduction_to_java;

import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        // Hiển thị thi dùng (sout)
        System.out.println("hello");
        // Nhập từ bàn phím => sử dụng đối tượng Scanner
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sc.nextLine(); // nhập chuỗi
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("nhập lương");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("Tên vừa nhập "+name);
        System.out.println("Tuổi vừa nhập "+age);
        System.out.println("Địa chỉ vừa nhập "+address);
        System.out.println("Lương vừa nhập "+salary);
        // lưu ý cần sử dụng toàn bộ nextLine()
    }
}
