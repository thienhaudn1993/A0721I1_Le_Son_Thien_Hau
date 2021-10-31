package bai11_stack_queue.bai_tap.dem_so_lan_xuat_hien_moi_tu_dung_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//[Bài tập] Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần đếm kí tự");
        String src = scanner.nextLine();
        // chuyển chuỗi về chữ thường
        src = src.toLowerCase();
        String[] arr = src.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count =1;
            if (treeMap.containsKey(arr[i])) {
                count+=treeMap.get(arr[i]);
            }
            if (!arr[i].equals(" ")) {
                treeMap.put(arr[i],count);
            }
        }
        for (Map.Entry<String, Integer> entry: treeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
