package com.example.restaurant.dto.menuDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuRequest {
    private String name;
    private byte[] image;
    private String description;
    private int price;
    private double weight;
}
