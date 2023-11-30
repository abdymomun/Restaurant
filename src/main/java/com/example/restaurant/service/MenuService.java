package com.example.restaurant.service;

import com.example.restaurant.dto.menuDTO.MenuRequest;
import com.example.restaurant.dto.menuDTO.MenuResponse;

import java.util.List;

public interface MenuService {
    void save(MenuRequest menuRequest,Long restaurantId);
    MenuResponse getById(Long id);
    List<MenuResponse> getAll();
    void update(MenuRequest menuRequest,Long id);
    void delete(Long id);
}
