package bai14_thuat_toan_sap_xep.demo_bai_hoc;

import java.util.Arrays;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        int[] arr1 = {1,-2,4,5,3,8,7};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        boolean flag=true;
        for (int j = 0; j < arr.length-1 && flag; j++) {
            flag=false;
            for (int i = arr.length-1; i > j  ; i--) {
                if (arr[i]<arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1]=temp;
                    flag=true;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("------------------------------------------");
//            System.out.println(Arrays.toString(arr));
        }
    }
}
