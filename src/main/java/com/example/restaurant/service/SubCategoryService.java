package com.example.restaurant.service;

import com.example.restaurant.dto.subCategory.SubCategoryRequest;
import com.example.restaurant.dto.subCategory.SubCategoryResponse;

import java.util.List;

public interface SubCategoryService {
    void save(SubCategoryRequest subCategoryRequest,Long menuId);
    SubCategoryResponse getById(Long id);
    List<SubCategoryResponse>getAll();
    void update(SubCategoryRequest subCategoryRequest,Long id);
    void delete(Long id);

}
