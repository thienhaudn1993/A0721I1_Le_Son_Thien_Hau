package bai3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr1=new int[3];
        int[]arr2=new int[3];
        int input;
        for (int i=0;i<arr1.length;i++){
            System.out.println("Nhập phần từ ở vị trí "+i+" của arr1");
            input=scanner.nextInt();
            arr1[i]=input;
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println("Nhập phần từ ở vị trí "+i+" của arr2");
            input=scanner.nextInt();
            arr2[i]=input;
        }
        System.out.println("Mảng arr1 vừa nhập là: "+ Arrays.toString(arr1));
        System.out.println("Mảng arr2 vừa nhập là: "+ Arrays.toString(arr2));
        int[]arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=arr2.length;i<arr3.length;i++){
            arr3[i]=arr2[i-arr2.length];
        }
        System.out.println("Mảng arr3 sau khi gộp từ 2 mảng arr1 và arr2 là: "+ Arrays.toString(arr3));
    }
}
