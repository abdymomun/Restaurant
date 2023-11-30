package com.example.restaurant.service.impl;

import com.example.restaurant.dto.menuDTO.MenuRequest;
import com.example.restaurant.dto.menuDTO.MenuResponse;
import com.example.restaurant.models.Menu;
import com.example.restaurant.models.Restaurant;
import com.example.restaurant.repository.MenuRepository;
import com.example.restaurant.repository.RestaurantRepository;
import com.example.restaurant.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;
    private final RestaurantRepository restaurantRepository;
    @Override
    public void save(MenuRequest menuRequest, Long restaurantId) {
        Menu menu = new Menu();
        menu.setName(menuRequest.getName());
        menu.setDescription(menuRequest.getDescription());
        menu.setPrice(menuRequest.getPrice());
        menu.setWeight(menuRequest.getWeight());
        menu.setImage(menuRequest.getImage());
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(null);
        menu.setRestaurant(restaurant);
        menuRepository.save(menu);
    }

    @Override
    public MenuResponse getById(Long id) {
        Menu menu = menuRepository.findById(id).orElseThrow(null);
        return new MenuResponse(menu.getName());
    }

    @Override
    public List<MenuResponse> getAll() {
        return menuRepository.getAll();
    }

    @Override
    public void update(MenuRequest menuRequest, Long id) {
        Menu menu = menuRepository.findById(id).orElseThrow(null);
        menu.setName(menuRequest.getName());
        menu.setDescription(menuRequest.getDescription());
        menu.setPrice(menuRequest.getPrice());
        menu.setWeight(menuRequest.getWeight());
        menu.setImage(menuRequest.getImage());
        menuRepository.save(menu);
    }

    @Override
    public void delete(Long id) {
        Menu menu = menuRepository.findById(id).orElseThrow(null);
        menu.setRestaurant(null);
        menuRepository.delete(menu);
    }
}
