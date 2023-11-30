package com.example.restaurant.service.impl;

import com.example.restaurant.dto.subCategory.SubCategoryRequest;
import com.example.restaurant.dto.subCategory.SubCategoryResponse;
import com.example.restaurant.models.Menu;
import com.example.restaurant.models.SubCategory;
import com.example.restaurant.repository.MenuRepository;
import com.example.restaurant.repository.SubCategoryRepository;
import com.example.restaurant.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SubCategoryServiceImpl implements SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;
    private final MenuRepository menuRepository;
    @Override
    public void save(SubCategoryRequest subCategoryRequest, Long menuId) {
        SubCategory subCategory = new SubCategory();
        subCategory.setName(subCategoryRequest.getName());
        Menu menu = menuRepository.findById(menuId).orElseThrow(null);
        subCategory.setMenu(menu);
        subCategoryRepository.save(subCategory);
    }

    @Override
    public SubCategoryResponse getById(Long id) {
        SubCategory subCategory = subCategoryRepository.findById(id).orElseThrow(null);
        return new SubCategoryResponse(subCategory.getName());
    }

    @Override
    public List<SubCategoryResponse> getAll() {
        return subCategoryRepository.getAll();
    }

    @Override
    public void update(SubCategoryRequest subCategoryRequest, Long id) {
        SubCategory subCategory = subCategoryRepository.findById(id).orElseThrow(null);
        subCategory.setName(subCategoryRequest.getName());
        subCategoryRepository.save(subCategory);
    }

    @Override
    public void delete(Long id) {
        SubCategory subCategory = subCategoryRepository.findById(id).orElseThrow(null);
        subCategoryRepository.delete(subCategory);
    }
}
