package bai3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Chiều dài mảng không vượt quá 20");
        } while (size > 20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Nhập phần từ "+(i+1)+" của mảng: ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("Phần từ của mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        for (int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("\nMảng sau khi đảo ngược phần tử là: ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j] + " ");
        }
    }
}
