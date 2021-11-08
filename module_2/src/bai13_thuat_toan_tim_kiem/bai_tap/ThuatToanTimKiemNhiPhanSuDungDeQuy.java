package bai13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiemNhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your input array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nAfter sort processing...");
        bubbleSortByStep(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Input value you need search in array");
        int value = scanner.nextInt();
        int left = 0;
        int right = arr.length-1;
        System.out.println("Index need find is: "+binarySearch(arr,left,right,value));

    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
        }
        System.out.println(Arrays.toString(list));
    }
    public static int binarySearch(int[] array, int left, int right ,int value) {
        while (left<=right) {
            int middle = (left+right)/2;
            if (array[middle]==value) {
                return middle;
            }else if (value > array[middle]) {
                left=middle+1;
            }else {
                right=middle-1;
            }
        }
        return -1;
    }
}
