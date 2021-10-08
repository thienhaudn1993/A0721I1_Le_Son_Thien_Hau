package bai4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng HCN");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều cao HCN");
        double height = scanner.nextDouble();
        // khởi tạo đối tượng rectangle
        Rectangle rectangle = new Rectangle(width,height);
        // gọi phương thức
        System.out.println("Rectangle: "+rectangle.display());
        System.out.println("Area Rectangle: "+rectangle.getArea());
        System.out.println("Perimeter Rectangle: "+rectangle.getPerimeter());
    }
}
