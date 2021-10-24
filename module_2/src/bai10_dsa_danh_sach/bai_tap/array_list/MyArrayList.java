package bai10_dsa_danh_sach.bai_tap.array_list;

import java.util.Arrays;
import java.util.IllegalFormatException;

public class MyArrayList<E> {
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
    public Object elements[];

    /**
     * Suc chua mac dinh khi khoi tao bang contrustor khong tham so
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phuong thuc khoi tao co suc chua truyen vao
     * @param capacity
     */
    public MyArrayList(int capacity) {
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
    public boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index ){
        if (index>elements.length){
            throw new IllegalArgumentException(("index "+index));
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
            size++;
        }
    }

    /**
     * Phuong thuc tang kich thuoc cua MyList
     * @param minCapacity
     */

    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize = this.elements.length+minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
        else {
            throw new IllegalArgumentException("minCapacity "+minCapacity);
        }
    }

    /**
     * Phương thức lấy 1 element tại ví trị index
     * @param index
     * @return
     */
    public E get(int index){
        return (E) elements[index];
    }

    /**
     * Phương thức lấy index của phần từ element
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * Phương thức kiểm tra 1 phần từ có trong MyArrayList hay không
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element) >=0;
    }

    /**
     * Phương thức clone tạo ra 1 bản sao của MyArrayList hiện có
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    public E remove(int index){
        if (index<0 || index>elements.length) {
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
