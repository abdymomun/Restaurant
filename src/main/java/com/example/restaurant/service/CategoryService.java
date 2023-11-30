package com.example.restaurant.service;

import com.example.restaurant.dto.categoryDTO.CategoryRequest;
import com.example.restaurant.dto.categoryDTO.CategoryResponse;

import java.util.List;

public interface CategoryService {
    void save(CategoryRequest categoryRequest,Long subCategoryId);
    CategoryResponse getById(Long id);
    List<CategoryResponse>getAll();
    void update(CategoryRequest categoryRequest,Long id);
    void delete(Long id);
}
