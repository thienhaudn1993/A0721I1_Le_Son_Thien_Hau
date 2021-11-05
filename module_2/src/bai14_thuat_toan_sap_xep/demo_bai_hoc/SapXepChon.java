package bai14_thuat_toan_sap_xep.demo_bai_hoc;

import java.util.Arrays;

public class SapXepChon {
    public static void main(String[] args) {
        int[] arr = {12,4,15};
        int[] arr1 = {8,5,3,4,6,-2,7};
        selectonSort(arr1);
    }
    public static void selectonSort(int[]array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[min]) {
                    min = j; // ghi nhận phần tử nhỏ nhất
                }
                System.out.println(Arrays.toString(array));
            }
            if (min !=i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
