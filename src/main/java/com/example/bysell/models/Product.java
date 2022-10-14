package com.example.bysell.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Description", columnDefinition = "text")
    private String description;
    @Column(name = "Price")
    private int price;
    @Column(name = "City")
    private String city;
    @Column(name = "Author")
    private String author;
}
