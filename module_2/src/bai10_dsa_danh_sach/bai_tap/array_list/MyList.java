package bai10_dsa_danh_sach.bai_tap.array_list;

import java.util.Arrays;
import java.util.IllegalFormatException;

public class MyList<E> {
    /**
     * số lượng phần tử trong MyList
     */
    private int size =0;
    /**
     * suc chua cua MyList
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Mang chua cac phan tu
     */
    private Object elements[];

    /**
     * Suc chua mac dinh khi khoi tao bang contrustor khong tham so
     */
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phuong thuc khoi tao co suc chua truyen vao
     * @param capacity
     */
    public MyList(int capacity) {
        if (capacity>=0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity: "+capacity);
        }
    }

    /**
     * Phuong thuc tra ve so luong phan tu
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Phuong thuc clean MyList
     */
    public void clean(){
        size=0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i]=null;
        }
    }

    /**
     * Phuong thuc add 1 phan tu vao MyList
     * @param element
     * @return
     */
    private boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true
    }

    private void add(E element, int index ){
        if (index>elements.length){
            throw new IllegalFormatException("index "+index);
        }else if (elements.length==size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null) {
           elements[index]=element;
        }else {
            for (int i = size+1; i >=index ; i--) {
                elements[i]= elements[i-1];
            }
            elements[index]=element;
            size++
        }
    }

    /**
     * Phuong thuc tang kich thuoc cua MyList
     * @param minCapacity
     */

    private void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize = this.elements.length+minCapacity;
            elements = Arrays.copyOf(size, newSize);
        }
        else {
            throw new IllegalFormatException("minCapacity "+minCapacity)
        }
    }

}
