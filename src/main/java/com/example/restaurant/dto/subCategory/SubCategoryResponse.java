package com.example.restaurant.dto.subCategory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubCategoryResponse {
    private String name;

    public SubCategoryResponse(String name) {
        this.name = name;
    }
}
