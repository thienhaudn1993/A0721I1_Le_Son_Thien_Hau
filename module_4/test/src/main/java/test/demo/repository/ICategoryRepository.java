package test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
