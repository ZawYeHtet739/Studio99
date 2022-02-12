package com.daos;

import com.models.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryDao {

    List<Category> getAllCategories();

    Category getCategoryById(int id);
}
