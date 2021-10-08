package bai3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheoMaTranVuong {
    public static void main(String[] args) {
        // Cho người dùng nhập kích thước ma trận, và phần từ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int col = scanner.nextInt();
        System.out.println("Ma trân nhập vào có "+row+" dòng và "+col+" cột");
        double[][]array = new double[row][col];
        System.out.println("Nhập phần tử của ma trận");
        double sum=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Nhập phần tử ở dòng "+(i+1)+" và côt "+(j+1));
                array[i][j]=scanner.nextDouble();
                if (i==j){
                    sum+=array[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Ma trận vừa nhập vào có các phần từ là:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Tổng đường chéo chính của ma trận vuông vừa tạo là "+sum);
    }
}
