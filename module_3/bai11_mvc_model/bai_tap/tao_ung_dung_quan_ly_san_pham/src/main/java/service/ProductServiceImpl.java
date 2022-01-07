package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    public static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Apple Watch S7","Apple",20,"New"));
        products.put(2,new Product(2,"Iphone 13","Apple",10,"New"));
        products.put(3,new Product(3,"SamSung Note 3","SamSung",5,"Used"));
        products.put(4,new Product(4,"Oppo R3","Oppo",20,"New"));
        products.put(5,new Product(5,"Dell N1234","Dell",11,"Used"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                return products.get(i);
            }
        }
        return null;
    }
}
