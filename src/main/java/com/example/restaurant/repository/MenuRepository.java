package com.example.restaurant.repository;

import com.example.restaurant.dto.menuDTO.MenuResponse;
import com.example.restaurant.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    @Query("select new com.example.restaurant.dto.menuDTO.MenuResponse(m.name) from Menu  m")
    List<MenuResponse>getAll();
}