package com.example.restaurant.api;

import com.example.restaurant.dto.restaurantDTO.RestaurantRequest;
import com.example.restaurant.dto.restaurantDTO.RestaurantResponse;
import com.example.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/save")
    public void save(@RequestBody RestaurantRequest restaurantRequest) {
        restaurantService.save(restaurantRequest);
    }

    @GetMapping("/{id}")
    public RestaurantResponse getById(@PathVariable Long id) {
        return restaurantService.getById(id);
    }

    @GetMapping("/all")
    public List<RestaurantResponse> getAll() {
        return restaurantService.getAll();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody RestaurantRequest restaurantRequest, @PathVariable Long id) {
        restaurantService.update(restaurantRequest, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        restaurantService.delete(id);
    }
}

