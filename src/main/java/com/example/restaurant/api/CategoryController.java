package com.example.restaurant.api;

import com.example.restaurant.dto.categoryDTO.CategoryRequest;
import com.example.restaurant.dto.categoryDTO.CategoryResponse;
import com.example.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/save")
    public void save(@RequestBody CategoryRequest categoryRequest, @RequestParam Long subCategoryId) {
        categoryService.save(categoryRequest, subCategoryId);
    }

    @GetMapping("/{id}")
    public CategoryResponse getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }

    @GetMapping("/all")
    public List<CategoryResponse> getAll() {
        return categoryService.getAll();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody CategoryRequest categoryRequest, @PathVariable Long id) {
        categoryService.update(categoryRequest, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
    }
}

