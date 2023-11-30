package com.example.restaurant.service;

import com.example.restaurant.dto.restaurantDTO.RestaurantRequest;
import com.example.restaurant.dto.restaurantDTO.RestaurantResponse;

import java.util.List;

public interface RestaurantService {
    void save (RestaurantRequest restaurantRequest);
    RestaurantResponse getById(Long id);
    List<RestaurantResponse>getAll();
    void update(RestaurantRequest restaurantRequest,Long id);
    void delete(Long id);

}
