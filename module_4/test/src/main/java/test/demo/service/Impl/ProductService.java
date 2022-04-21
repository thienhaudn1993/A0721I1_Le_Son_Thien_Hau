package test.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import test.demo.model.Product;
import test.demo.repository.IProductRepository;
import test.demo.service.IProductService;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void removeProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> searchProductByName(String name, Pageable pageable) {
        return productRepository.searchProductByName(name, pageable);
    }
}
