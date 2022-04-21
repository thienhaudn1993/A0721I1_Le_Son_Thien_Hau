package com.codegym.controller.service;

import com.codegym.controller.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone12", 1200, "Apple"));
        products.put(2, new Product(2, "Iphone13", 1500, "Apple"));
        products.put(3, new Product(3, "Note 13", 500, "SamSung"));
        products.put(4, new Product(4, "Remi5", 700, "Oppo"));
        products.put(5, new Product(5, "Macbook Pro", 2500, "Apple"));
        products.put(6, new Product(6, "Dell N5410", 1100, "Dell"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
