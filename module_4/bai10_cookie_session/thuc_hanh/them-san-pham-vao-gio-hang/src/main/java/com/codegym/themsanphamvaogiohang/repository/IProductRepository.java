package com.codegym.themsanphamvaogiohang.repository;

import com.codegym.themsanphamvaogiohang.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
}
