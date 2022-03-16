package com.codegym.themsanphamvaogiohang.service;

import com.codegym.themsanphamvaogiohang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
