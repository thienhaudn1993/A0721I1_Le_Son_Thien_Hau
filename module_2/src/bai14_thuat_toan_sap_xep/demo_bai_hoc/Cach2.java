package bai14_thuat_toan_sap_xep.demo_bai_hoc;

import java.util.Arrays;

public class Cach2 {
    public static void main(String[] args) {
        int[] arr= {8,6,34,22,11};

        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
    }


    private static void insertionSort(int[] arr){
        int length= arr.length;

        for (int i = 1; i < length; i++) {
            int tmp= arr[i];
            int pos= i-1;

            while (pos>=0 && arr[pos]> tmp){
                arr[pos+1]= arr[pos];
                pos--;
            }

            arr[pos+1]= tmp;

            System.out.println(Arrays.toString(arr));
        }
    }

    private static void selectionSort(int[] arr){
        int length= arr.length;

        for (int i = 0; i < length; i++) {
            int min_pos= i;

            for (int j = i; j < length; j++) {
                if(arr[min_pos] > arr[j]){
                    min_pos= j;
                }
            }

            if(min_pos!=i){
                int tmp= arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i]= tmp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    private static void bubbleSort(int[] arr){
        int length= arr.length;
        for (int i = 0; i < length; i++) {
            boolean isSorted= true;

            for (int j = 0; j < length- i- 1; j++) {

                if(arr[j] > arr[j+1]){
                    int tmp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= tmp;
                    isSorted= false;
                }
            }

//            if(isSorted) break;
            System.out.println(Arrays.toString(arr));
        }

    }
}
