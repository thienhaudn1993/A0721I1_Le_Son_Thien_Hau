package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập sô cần kiểm tra có phải số nguyên tố không");
        int number = sc.nextInt();

        if (number<2){
            System.out.println(number+" không phải số nguyên tố");
        }
        else {
            boolean check = true;
            for (int i=2; i<number;i++){
                if (number%i==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(number+" là số nguyên tố");
            }
            else{
                System.out.println(number+" không phải là số nguyên tố");
            }
        }
    }
}
