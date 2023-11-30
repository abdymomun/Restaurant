package com.example.restaurant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(generator = "menu_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "menu_gen", sequenceName = "menu_seq",allocationSize = 1)
    private Long id;
    private String name;
    private byte[] image;
    private String description;
    private int price;
    private double weight;
    @ManyToOne
    private Restaurant restaurant;
    @OneToMany(mappedBy = "menu")
    private List<SubCategory>subCategories;

}
