package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =-1;
        while (choice!=0){
            System.out.println("Bài tập hiển thị các hình");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("In hình chữ nhật");
                    String sharp = "";
                    for (int i=1;i<=3;i++){
                        for (int j=1;j<=7;j++){
                            sharp+=" * ";
                        }
                        sharp+="\n";
                    }
                    System.out.println(sharp);
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                    sharp = "";
                    for (int i=1;i<=5;i++){
                        for (int j=1;j<=i;j++){
                                sharp+=" * ";
                        }
                        sharp+="\n";
                    }
                    System.out.println(sharp);
                    break;
                case 3:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    sharp = "";
                    for (int i=5;i>=1;i--){
                        for (int j=1;j<=i;j++){
                            sharp+=" * ";
                        }
                        sharp+="\n";
                    }
                    System.out.println(sharp);
                    break;
                case 4:
                    System.out.println("In hình tam giác cân");
                    sharp = "";
                    // chưa làm
                    /*for (int i=1;i<=5;i++){
                        for (int j=1;j<=i;j++){
                            sharp+=" * ";
                        }
                        sharp+="\n";
                    }
                    System.out.println(sharp);*/
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
