package bai3_mang_phuong_thuc_trong_java.bai_tap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        // Cách 1: nhập 1 mảng 2 chiều nhanh
       /* double[][]array={{1,-22,42},{12,-5,-9},{82,0,5}};
        System.out.println("Ma trận cho sẵn là ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        double result = findMax(array,3,3);
        System.out.println("Phần tử có giá trị max là: "+result);*/
    //-----------------------------------------------------------------------------

        // Cách 2: Cho người dùng nhập kích thước ma trận, và phần từ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int col = scanner.nextInt();
        System.out.println("Ma trân nhập vào có "+row+" dòng và "+col+" cột");
        double[][]array = new double[row][col];
        System.out.println("Nhập phần tử của ma trận");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Nhập phần tử ở dòng "+(i+1)+" và côt "+(j+1));
                array[i][j]=scanner.nextDouble();
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
        double result = findMax(array,row,col);
        System.out.println("Phần từ lớn nhất trong ma trận là "+result);
    }
    public static double findMax(double[][]arr,int row, int col){
        double max = arr[0][0];
        int x=0,y=0; // tọa độ của phần từ lớn nhất trong mảng 2 chiều
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Tọa độ phần từ lớn nhất x= "+x+" và y= "+y);
        return max;
    }
}
