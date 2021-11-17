package bai11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_dung_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stacks = new Stack<>();
        Queue<Character> queues = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra Palindrome ");
        String input = scanner.nextLine();
        // chuyển chuỗi về chữ thường
        String src = input.toLowerCase();
        for (int i = 0; i < src.length(); i++) {
            stacks.push(src.charAt(i));
            queues.add(src.charAt(i));
        }
        System.out.println("Danh sách phần từ trong stacks");
        System.out.println(stacks);
        System.out.println("Danh sách phần từ trong queues");
        System.out.println(queues);
        boolean flag = true;
        while (!stacks.isEmpty()) {
            if (stacks.pop() != queues.remove()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Chuỗi nhập vào là: "+input);
            System.out.println("Đây là chuỗi Palindrome");
        }
        else {
            System.out.println("Chuỗi nhập vào là: "+input);
            System.out.println("Đây không phải là chuỗi Palindrome");
        }

        /**
         * Cach 2
         */
        /*Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chuoi");
        String input = scanner.nextLine();
        String src = input.toLowerCase();
        System.out.println("chuoi nhap " +src);
        String[] array = src.split("");
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
            stack.push(array[i]);
        }
        System.out.println("Danh sách phần từ trong stacks");
        System.out.println(stack);
        System.out.println("Danh sách phần từ trong queues");
        System.out.println(queue);
        boolean check = true;
        while (!stack.isEmpty()) {
            if (!(stack.pop()).equals(queue.remove())){
                check=false;
                break;
            }
        }
        if (check){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

    }
}
