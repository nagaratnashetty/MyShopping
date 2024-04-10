package com.myshopping.MyShopping.models;

import jakarta.persistence.*;

import java.util.Scanner;
import java.util.UUID;

@Entity // This annotation will tell hibernate that you need to create table. :
// Inside the entity class, you define attributes that map to columns in the database table.
// for this class
public   class AppUser {
    @Id//In Spring Boot, @Id is an annotation from the Java Persistence API (JPA) that is used to denote
    // the primary key of an entity. When you mark a field with @Id, you are telling JPA that this field uniquely identifies each instance of the entity in the database. Here's a more detailed explanation:
    //Primary Key Definition: In a database table, the primary key uniquely identifies each record.
    // In JPA entities, you use @Id to designate which field serves as the primary key for that entity.
    // Usage in Entity Classes: Typically, you place @Id above a field in your entity class that uniquely
    // identifies each entity instance
    @GeneratedValue(strategy = GenerationType.AUTO)
            //In Spring Boot and JPA, @GeneratedValue(strategy = GenerationType.AUTO) is an annotation
    // used to specify how primary key values are generated for an entity.
    // Let's break down what this annotation means and how it's typically used
    // @GeneratedValue: This annotation is used to specify the strategy for generating
    // primary key values automatically.
    //strategy = GenerationType.AUTO: This part of the annotation specifies that the persistence provider
    // (such as Hibernate in a Spring Boot application using JPA) should automatically determine the most
    // appropriate strategy for generating primary key values based on the underlying database.
    UUID id; // Unique base64Id -> It is the kind that got generated on the basis of time
    //A UUID (Universally Unique Identifier) is a 128-bit identifier that is globally unique.
    // It is often used in software development to uniquely identify entities without requiring
    // centralized coordination. In Java and Spring Boot applications, UUIDs can be generated using
    // the java.util.UUID class.
    // Here's an overview of how you can work with UUIDs in your Spring Boot application:
    @Column(nullable = false)//The @Column(nullable = false) annotation in Spring Boot and JPA is used to
            // specify that a column in the database should not allow null values. This means that when
            // an entity is persisted to the database, the corresponding
            // column for a field annotated with @Column(nullable = false) must always have a non-null value.
    String name;
    @Column(unique = true, nullable = false)//This part of the annotation specifies that the values in the
    // column must be unique across all rows in the database table. In other words, no two rows can have
    // the same value in this column.
    String email;
    @Column(nullable = false)
    String password;
    String userType;
    @Column(unique = true, length = 10)
    Long phoneNumber;

    public AppUser() {
    }

    public AppUser(UUID id, String name, String email, String password, String userType, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}