package com.example.restaurant.repository;

import com.example.restaurant.dto.restaurantDTO.RestaurantResponse;
import com.example.restaurant.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query("select new com.example.restaurant.dto.restaurantDTO.RestaurantResponse(r.name) from Restaurant r")
    List<RestaurantResponse>getAllRestaurant();
}