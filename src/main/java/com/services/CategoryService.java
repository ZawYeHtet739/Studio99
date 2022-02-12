package com.services;

import com.daos.CategoryDao;
import com.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getAllCategories() {
        List<Category> categories = categoryDao.getAllCategories();
        return categories;
    }

    public Category getCategoryById(int product_id){
        Category category = categoryDao.getCategoryById(product_id);
        return category;
    }

}
