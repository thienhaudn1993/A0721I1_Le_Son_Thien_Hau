package bai11_stack_queue.bai_tap.on_tap;

import java.util.*;

public class Baitap1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
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
        }
    }
}
