package com.myshopping.MyShopping.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class CartTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    int quantity;
    @OneToOne
    AppUser user;
    int totalPrice;


    @OneToMany
    List<Product> products;

    public
    CartTable(UUID id, int quantity, AppUser user, int totalPrice, List<Product> products) {
        this.id = id;
        this.quantity = quantity;
        this.user = user;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    public CartTable() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

//In database design and object-relational mapping (ORM) frameworks like JPA in Spring Boot, we use different types of relationships between entities to model the relationships that exist in the real world. These relationships include one-to-one, one-to-many, many-to-one, and many-to-many. Here's why we use each type:
//
//One-to-One (1:1):
//
//Usage: When one instance of an entity is associated with exactly one instance of another entity.
//Example: A Person entity might have a one-to-one relationship with an Address entity, where each person has exactly one address.
//Purpose: Used for relationships where each entity instance is uniquely associated with another entity instance.
//One-to-Many (1:N):
//
//Usage: When one instance of an entity can be associated with multiple instances of another entity.
//Example: A Department entity might have a one-to-many relationship with Employee entities, where each department can have multiple employees.
//Purpose: Used for hierarchical relationships where one entity (parent) can have multiple related entities (children).
//Many-to-One (N:1):
//
//Usage: When multiple instances of an entity can be associated with exactly one instance of another entity.
//Example: Many Students can belong to one School, creating a many-to-one relationship between Student and School entities.
//Purpose: Used for relationships where multiple entities are related to a single entity.
//Many-to-Many (N:M):
//
//Usage: When multiple instances of an entity can be associated with multiple instances of another entity.
//Example: Book entities might have a many-to-many relationship with Author entities, where each book can have multiple authors, and each author can write multiple books.
//Purpose: Used for complex relationships where entities can be related to multiple other entities.