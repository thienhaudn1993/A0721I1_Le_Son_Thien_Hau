package com.codegym.addtocard.service;

import com.codegym.addtocard.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    void saveProduct(Product product);

    void deleteProduct(Long id);

    Product findById(Long id);

}
