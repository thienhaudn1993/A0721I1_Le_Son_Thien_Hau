package bai15_exception_debug.demo_bai_hoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoA7 {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào đường dẫn");
        String path = scanner.nextLine();
        try {
            readFile2(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
//        try {
//            readFile2(path);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        getElementInArray();
        try {
            inputAge();
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("kết thúc chương trình");
    }

    public static void getElementInArray() {
        int[] array = {12, 13, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.println("bắt đầu");
        System.out.println("nhập vào 1 số");
        int n = 0;
        try {
            n = scanner.nextInt();
            System.out.println("số vừa nhập: " + n);
            System.out.println("Phần tử thứ : " + n + "-" + array[n]);

        } catch (InputMismatchException e) {
            // xử lý
            e.printStackTrace();
            System.out.println("Lỗi nhập chuỗi");

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Lỗi trùy cập ngoài pt mảng");
        }

        System.out.println("chương trình kết thúc");
    }

    public static void readFile1(String filePath) {
        File file = new File(filePath);
        // xử lý tại chỗ
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("đọc ghi file thanhf công");
        } catch (FileNotFoundException e) {
            // code cần xử lý khi exception xảy ra
            e.printStackTrace();
            System.out.println("khối catch chạy");
        } /*finally {
            // dùng đẻ đóng kết nối file.
            System.out.println("khôi finally bao giờ cũng chạy");
        }*/
        System.out.println("kêt thúc chương trình");

    }

    public static void readFile2(String filePath)throws FileNotFoundException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        System.out.println("đọc ghi file thanhf công");
        System.out.println("kêt thúc chương trình");

    }

    public static int inputAge() throws AgeException   {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 18) {
            // ném ra exception tự định nghĩa
            throw new AgeException("Tuổi nhỏ hon 18");
        }else if (age>100){
            throw new AgeException("Tuoi lớn hơn 100");
        }
        return age;
    }
}
