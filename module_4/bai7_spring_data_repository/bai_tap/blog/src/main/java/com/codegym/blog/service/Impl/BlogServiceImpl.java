package com.codegym.blog.service.Impl;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }
}
