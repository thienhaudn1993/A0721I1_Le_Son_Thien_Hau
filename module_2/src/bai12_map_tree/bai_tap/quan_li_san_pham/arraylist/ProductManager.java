package bai12_map_tree.bai_tap.quan_li_san_pham.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productArrayList = new ArrayList<>();
    static int id=1;
    static {
        productArrayList.add(new Product(id++,"Apple Watch",150));
        productArrayList.add(new Product(id++,"Macbook Air",1500));
        productArrayList.add(new Product(id++,"Macbook Pro",2200));
    }
    public void add(){
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
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                System.out.println("Tên sản phẩm hiện tại là: ");
                System.out.println(productArrayList.get(i).getName());
                System.out.println("Giá sản phẩm hiện tại là: ");
                System.out.println(productArrayList.get(i).getPrice());
                System.out.println("Tên sản phẩm muốn đổi là: ");
                String editName = scanner.nextLine();
                productArrayList.get(i).setName(editName);
                System.out.println("Tên sản phẩm sau khi đổi là: "+productArrayList.get(i));
                System.out.println("Nhập giá cần đổi");
                double editPrice = Double.parseDouble(scanner.nextLine());
                productArrayList.get(i).setPrice(editPrice);
                System.out.println("Giá sau khi đổi là: "+productArrayList.get(i));
            }
        }

    }
    public void delete(){
        System.out.println("Nhập id mà bạn muốn xóa sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(i);
            }
        }
    }
    public boolean find(){
        System.out.println("Nhập tên sản phẩm cần tìm");
        String findName = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (findName.equals(productArrayList.get(i).getName())) {
                return true;
            }
        }
        return flag;
    }
    public void sort(){

    }

}
