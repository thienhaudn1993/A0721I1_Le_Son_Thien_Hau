package com.codegym.blogajax.service;

import com.codegym.blogajax.dto.BlogDTO;
import com.codegym.blogajax.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog saveBlog(Blog blog);

    void deleteBlog(Long id);

    Blog findBlogById(Long id);

    void saveBlogDTO(BlogDTO blogDTO);

    List<Blog> searchByNameBlog(String name);
}
