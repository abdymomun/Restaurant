package com.example.restaurant.repository;

import com.example.restaurant.dto.subCategory.SubCategoryResponse;
import com.example.restaurant.models.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    @Query("select new com.example.restaurant.dto.subCategory.SubCategoryResponse(s.name) from SubCategory s")
    List<SubCategoryResponse>getAll();
}