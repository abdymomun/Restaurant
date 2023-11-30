package com.example.restaurant.dto.categoryDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryResponse {
    private String name;
    private byte[] image;

    public CategoryResponse(String name, byte[] image) {
        this.name = name;
        this.image = image;
    }
}
