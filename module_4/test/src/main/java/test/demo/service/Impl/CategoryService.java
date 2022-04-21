package test.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.demo.model.Category;
import test.demo.repository.ICategoryRepository;
import test.demo.service.ICategoryService;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Category> findCategoryByAll() {
        return categoryRepository.findAll();
    }
}
