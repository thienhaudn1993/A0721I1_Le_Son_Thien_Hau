package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog saveBlog(Blog blog);

    void deleteBlog(Long id);

    Blog findBlogById(Long id);
    Page<Blog> findAllByNameBlogContaining(String nameBlog,Pageable pageable);
//    Page<Blog> sortTime(Pageable pageable);
}
