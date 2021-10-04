package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in");
        int numbers = scanner.nextInt();
        int count =0;
        int n=2;
        String daySo="";
        while (count<numbers){
            boolean flag=true;
            if (n<2){
                flag=false;
            }
            else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
                if (flag){
                    daySo+=n+",";
                    count++;
                }
            n++;
        }
        System.out.println("Dãy số nguyên tố là "+daySo);
    }
}
