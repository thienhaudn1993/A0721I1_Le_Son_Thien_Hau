package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class MinhHoainsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,4,15};
        int[] arr1 = {1,5,8,4,6,-2,7};
        insertSort(arr1);
    }
    public static void insertSort(int[] array){
        int pos,x;
        for (int i = 1; i < array.length; i++) {
            x=array[i];
            pos=i;
            while (pos>0 && x<array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos]=x;
            System.out.println(Arrays.toString(array));
        }
    }
}
