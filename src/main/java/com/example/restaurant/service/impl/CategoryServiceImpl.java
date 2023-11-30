package com.example.restaurant.service.impl;

import com.example.restaurant.dto.categoryDTO.CategoryRequest;
import com.example.restaurant.dto.categoryDTO.CategoryResponse;
import com.example.restaurant.models.Category;
import com.example.restaurant.models.SubCategory;
import com.example.restaurant.repository.CategoryRepository;
import com.example.restaurant.repository.SubCategoryRepository;
import com.example.restaurant.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subCategoryRepository;
    @Override
    public void save(CategoryRequest categoryRequest, Long subCategoryId) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        category.setImage(categoryRequest.getImage());
        SubCategory subCategory = subCategoryRepository.findById(subCategoryId).orElseThrow(null);
        category.setSubCategory(List.of(subCategory));
        categoryRepository.save(category);
    }

    @Override
    public CategoryResponse getById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(null);
        return new CategoryResponse(category.getName(),category.getImage());
    }

    @Override
    public List<CategoryResponse> getAll() {
        return categoryRepository.getAll() ;
    }

    @Override
    public void update(CategoryRequest categoryRequest, Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(null);
        category.setName(categoryRequest.getName());
        category.setImage(categoryRequest.getImage());
        categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(null);
        categoryRepository.delete(category);
    }
}
