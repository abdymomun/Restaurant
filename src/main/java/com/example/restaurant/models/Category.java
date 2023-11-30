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
public class Category {
    @Id
    @GeneratedValue(generator = "category_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "category_gen", sequenceName = "category_seq",allocationSize = 1)
    private Long id;
    private String name;
    private byte[] image;
    @OneToMany(mappedBy = "category")
    private List<SubCategory> subCategory;
}
