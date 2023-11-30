package com.example.restaurant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(generator = "restaurant_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "restaurant_gen", sequenceName = "restaurant_seq",allocationSize = 1)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "restaurant")
    private List<Menu>menus;

}
