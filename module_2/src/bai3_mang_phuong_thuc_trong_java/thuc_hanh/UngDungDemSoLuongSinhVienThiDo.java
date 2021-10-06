package bai3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int[]array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng học sinh");
            size = scanner.nextInt();
            if (size>30){
                System.out.println("Vui lòng nhập nhỏ hơn 30");
            }
        }while (size>30);
        array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("Nhập điểm sinh viên "+(i+1)+" là: ");
            array[i]=scanner.nextInt();
        }
        int count =0;
        System.out.println("Danh sách điểm sinh viên vừa nhập là:");
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){
            if (array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("Số lượng học sinh đậu là "+count);
    }
}
