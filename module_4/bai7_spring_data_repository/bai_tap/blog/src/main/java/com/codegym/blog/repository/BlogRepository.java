package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByNameBlogContaining(String nameBlog, Pageable pageable);

    /*@Query("select * from blog where blog.date order by asc")
    Page<Blog> sortTime(Pageable pageable);*/
}
