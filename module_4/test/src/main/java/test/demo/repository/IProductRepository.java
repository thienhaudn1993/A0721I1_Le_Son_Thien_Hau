package test.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.demo.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from Product e where e.name like %?1%",
            countQuery = "select count(*) from Product e where e.name like concat('%',?1,'%')",
            nativeQuery = true)
    Page<Product> searchProductByName(String name, Pageable pageable);
}
