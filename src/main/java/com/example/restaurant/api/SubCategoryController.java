package com.example.restaurant.api;

import com.example.restaurant.dto.subCategory.SubCategoryRequest;
import com.example.restaurant.dto.subCategory.SubCategoryResponse;
import com.example.restaurant.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategories")
public class SubCategoryController {

    private final SubCategoryService subCategoryService;

    @Autowired
    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    @PostMapping("/save")
    public void save(@RequestBody SubCategoryRequest subCategoryRequest, @RequestParam Long menuId) {
        subCategoryService.save(subCategoryRequest, menuId);
    }

    @GetMapping("/{id}")
    public SubCategoryResponse getById(@PathVariable Long id) {
        return subCategoryService.getById(id);
    }

    @GetMapping("/all")
    public List<SubCategoryResponse> getAll() {
        return subCategoryService.getAll();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody SubCategoryRequest subCategoryRequest, @PathVariable Long id) {
        subCategoryService.update(subCategoryRequest, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        subCategoryService.delete(id);
    }
}

