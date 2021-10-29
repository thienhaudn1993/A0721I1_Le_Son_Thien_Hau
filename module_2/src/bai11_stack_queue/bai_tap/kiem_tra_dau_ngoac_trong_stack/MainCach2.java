package bai11_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MainCach2 {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra");
        String input = scanner.nextLine();
        input=input.replace(" ", ""); // xóa dấu cách trống trong biểu thức
        String[] arr = input.split("");
        System.out.println(Arrays.toString(arr));
        boolean check = true;
        String left="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                if (i !=0) {
                    boolean compare = !arr[i-1].equals("+") && !arr[i-1].equals("-") && !arr[i-1].equals("*") && !arr[i-1].equals("/");
                    if (compare) {
                        check = false;
                        break;
                    }
                }
                bStack.push(arr[i]);
            }
            else if (arr[i].equals(")")) {
                if (bStack.isEmpty()) {
                    check = false;
                    break;
                }
                    left = bStack.pop();
                    if (!left.equals("(")){
                        check=false;
                        break;
                    }
                }
            }
        if (bStack.isEmpty() && check){
            System.out.println("Well");
        }
        else {
            System.out.println("Wrong");
        }

    }
}
