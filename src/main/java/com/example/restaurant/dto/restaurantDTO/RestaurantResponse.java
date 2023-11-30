package com.example.restaurant.dto.restaurantDTO;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class RestaurantResponse {
    private String name;

    public RestaurantResponse(String name) {
        this.name = name;
    }
}
