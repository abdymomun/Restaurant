package com.example.restaurant.dto.menuDTO;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MenuResponse {
    private String name;

    public MenuResponse(String name) {
        this.name = name;
    }
}
