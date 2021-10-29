package bai12_map_tree.bai_tap.quan_li_san_pham.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productArrayList = new ArrayList<>();
    static {
        productArrayList.add(new Product(1,"Apple Watch",150));
        productArrayList.add(new Product(2,"Macbook Air",1500));
        productArrayList.add(new Product(3,"Macbook Pro",2200));
    }
    public void add(){
        System.out.println("Nhập id của máy");
        boolean flag = true;
        int id=0;
        do {
            int inputID = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < productArrayList.size(); i++) {
                if (inputID != productArrayList.get(i).getId()) {
                    inputID = id;
                    flag=true;
                    break;
                }
                else {
                    System.out.println("ID bị trùng, vui lòng nhập ID khác");
                    flag=false;
                }
            }
        }while (flag);


        System.out.println("Nhập tên của máy");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id,name,price);
        productArrayList.add(product);
    }
    public void display(){
        System.out.println("Hiển thị danh sách sản phẩm");
        for (Product product:productArrayList) {
            System.out.println(product.toString());
        }

    }
    public void edit(){
        System.out.println("Nhập id mà bạn muốn edit");
        int index=0;
        boolean check = false;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                check = true;
                index=i;
                break;
            }
        }

    }
    public void delete(){

    }
    public void find(){

    }
    public void sort(){

    }

}
