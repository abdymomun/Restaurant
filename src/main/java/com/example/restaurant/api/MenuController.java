package com.example.restaurant.api;

import com.example.restaurant.dto.menuDTO.MenuRequest;
import com.example.restaurant.dto.menuDTO.MenuResponse;
import com.example.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/save")
    public void save(@RequestBody MenuRequest menuRequest, @RequestParam Long restaurantId) {
        menuService.save(menuRequest, restaurantId);
    }

    @GetMapping("/{id}")
    public MenuResponse getById(@PathVariable Long id) {
        return menuService.getById(id);
    }

    @GetMapping("/all")
    public List<MenuResponse> getAll() {
        return menuService.getAll();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody MenuRequest menuRequest, @PathVariable Long id) {
        menuService.update(menuRequest, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        menuService.delete(id);
    }
}
