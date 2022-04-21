package com.codegym.blogajax.repository;

import com.codegym.blogajax.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
    @Query("select c from Category c where c.id=?1")
    Category changeCategory(Long id);
}
