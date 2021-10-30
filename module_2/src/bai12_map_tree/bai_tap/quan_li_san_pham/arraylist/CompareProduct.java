package bai12_map_tree.bai_tap.quan_li_san_pham.arraylist;

import java.util.Comparator;

public class CompareProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
//        if (o1.getName().compareTo(o2.getName())==0) {
            return (int) (o1.getPrice()-o2.getPrice());
//        }
//        return o1.getName().compareTo(o2.getName());
    }
}
