package test.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import test.demo.model.Product;

import java.util.List;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    Product findProductById(Long id);

    void save(Product product);

    void removeProductById(Long id);

    Page<Product> searchProductByName(String name, Pageable pageable);
}
