package test.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import test.demo.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findCategoryByAll();
}
