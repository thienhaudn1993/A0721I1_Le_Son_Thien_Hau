package bai3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean flag=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                flag=true;
                System.out.println("Vị trí của học sinh tên "+input_name+" nằm ở vị trí "+(i+1));
                break;
            }
        }
        if (!flag){
            System.out.println("Không có tên trong danh sách");
        }

    }
}
