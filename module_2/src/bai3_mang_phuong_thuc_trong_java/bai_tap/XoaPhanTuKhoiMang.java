package bai3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr ={10,4,6,7,8,6,0,2,0,0};
        int index=0;
        System.out.println("Mảng ban đầu có các phần từ sau:");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nNhập số cần tìm trong mảng");
        int nhap=scanner.nextInt();

        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            if (nhap==arr[i]){
                flag = true;
                index=i;
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }
        }
        if (flag){
            System.out.println("Mảng sau khi xóa có các phần tử sau:");
            System.out.println(Arrays.toString(arr));
            System.out.println("Vị trí phần tử cần xóa là: "+index);
        }
        else {
            System.out.println("\nkhông có "+nhap+" trong mảng");
        }

    }
}
