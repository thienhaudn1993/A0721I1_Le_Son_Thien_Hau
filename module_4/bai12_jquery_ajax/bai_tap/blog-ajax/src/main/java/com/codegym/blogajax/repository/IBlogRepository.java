package com.codegym.blogajax.repository;

import com.codegym.blogajax.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Long> {
    @Query(value = "select * from blog where nameBlog like %?1%",nativeQuery = true)
    List<Blog> searchByNameBlog(String name);
}
