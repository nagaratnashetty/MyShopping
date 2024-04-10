package com.myshopping.MyShopping.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * Whenever we will add a new product so a new unique id will automatically get generated.
     */
            UUID id;
    String name;
    String category;
    int quantity;
    int price;
    @ManyToOne
    AppUser user; // Relationship is betweern user table and product table.
    // User which we will be consendring here is only sellers type.
    // many products in product table can be owned by one user so relationship is many to one
    String rating;
    String description;

    public Product(UUID id, String name, String category, int quantity, int price, AppUser user, String rating, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.user = user;
        this.rating = rating;
        this.description = description;
    }

    public Product() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}