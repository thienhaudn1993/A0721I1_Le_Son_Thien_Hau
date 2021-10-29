package bai11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì");
        String mWork = scanner.nextLine();
        System.out.println("Chuỗi nhập vào là: "+mWork);
        for (int i = 0; i < mWork.length(); i++) {
            wStack.push(mWork.charAt(i));
        }
        System.out.println(wStack);
        StringBuilder src = new StringBuilder();
        while (!wStack.isEmpty()) {
            for (int i = 0; i < wStack.size(); i++) {
                src.append(wStack.pop());
            }
        }
        System.out.println("Chuỗi sau khi đảo ngược phần từ là: "+src);
    }
}
