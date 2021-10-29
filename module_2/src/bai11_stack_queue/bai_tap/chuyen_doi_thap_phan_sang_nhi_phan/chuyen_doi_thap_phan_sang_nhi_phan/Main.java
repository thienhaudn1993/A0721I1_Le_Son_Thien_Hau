package bai11_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // ứng dụng chuyển đổi thập phân sang nhị phần  10/2=5 du 0 => 5/2=2 du 1 => 2/2 =1 dư 0 , 1/2=0 du 1   1010
        //            System.out.println(decimal/2);
        //            System.out.println(decimal%2);
        Stack<Integer> stacks = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int decimal;
        do {
            System.out.println("Vui lòng nhập số nguyên dương bất kì cần chuyển qua hệ nhị phân");
            decimal = scanner.nextInt();
        }while (decimal<0);

        System.out.println("Số nhị phân của "+decimal+" là: ");
        while (decimal !=0) {
            int phanDu = decimal%2;
            stacks.push(phanDu);
            decimal = decimal/2;
        }
        while (!stacks.isEmpty()) {
            System.out.print(stacks.pop());
        }




        /*Stack<Integer> stacks = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số số nguyên bất kì cần chuyển qua hệ nhị phân");
        int decimal = scanner.nextInt();
        int[] decimalArray = new int[100];
        int index =0;
        while (decimal>0) {
            decimalArray[index++] = decimal%2;
            decimal = decimal/2;
        }
        for (int i = 0; i <= index-1; i++) {
            System.out.println(decimalArray[i]);
            stacks.push(decimalArray[i]);
        }
        System.out.println(stacks);

        while (!stacks.isEmpty()) {
            System.out.print(stacks.pop());
        }*/
    }
}
