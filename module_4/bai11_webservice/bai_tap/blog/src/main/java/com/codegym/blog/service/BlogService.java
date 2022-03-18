package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void saveBlog(Blog blog);

    void deleteBlog(Long id);

    Blog findBlogById(Long id);
    List<Blog> searchByCategoryId(int id);

}
