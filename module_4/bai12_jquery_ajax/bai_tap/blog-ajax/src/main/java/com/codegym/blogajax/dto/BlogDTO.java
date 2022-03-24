package com.codegym.blogajax.dto;

import com.codegym.blogajax.model.Category;

public class BlogDTO {
    private Long id;
    private String nameBlog;
    private String content;
    private String date;
    private Integer category;

    public BlogDTO() {
    }

    public BlogDTO(Long id, String nameBlog, String content, String date, Integer category) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.content = content;
        this.date = date;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
