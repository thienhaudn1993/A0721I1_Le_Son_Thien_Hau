package com.codegym.addtocard.service;

import com.codegym.addtocard.model.Product;
import com.codegym.addtocard.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return iProductRepository.findById(id).orElse(null);
    }


}
