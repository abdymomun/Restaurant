package com.example.restaurant.repository;

import com.example.restaurant.dto.categoryDTO.CategoryResponse;
import com.example.restaurant.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select new com.example.restaurant.dto.categoryDTO.CategoryResponse(c.name,c.image) from Category c")
    List<CategoryResponse>getAll();
}