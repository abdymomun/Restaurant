package com.example.restaurant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategory {
    @Id
    @GeneratedValue(generator = "sub_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sub_gen", sequenceName = "sub_gen",allocationSize = 1)
    private Long id;
    private String name;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Menu menu;
}
