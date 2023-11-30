package com.example.restaurant.service.impl;

import com.example.restaurant.dto.restaurantDTO.RestaurantRequest;
import com.example.restaurant.dto.restaurantDTO.RestaurantResponse;
import com.example.restaurant.models.Restaurant;
import com.example.restaurant.repository.RestaurantRepository;
import com.example.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository repository;
    @Override
    public void save(RestaurantRequest restaurantRequest) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurantRequest.getName());
        repository.save(restaurant);
    }

    @Override
    public RestaurantResponse getById(Long id) {
        Restaurant restaurant = repository.findById(id).orElseThrow(null);
        return new RestaurantResponse(restaurant.getName());
    }

    @Override
    public List<RestaurantResponse> getAll() {
        return repository.getAllRestaurant();
    }

    @Override
    public void update(RestaurantRequest restaurantRequest, Long id) {
        Restaurant restaurant = repository.findById(id).orElseThrow(null);
        restaurant.setName(restaurantRequest.getName());
        repository.save(restaurant);

    }

    @Override
    public void delete(Long id) {
        Restaurant restaurant = repository.findById(id).orElseThrow(null);
        repository.delete(restaurant);
    }
}
