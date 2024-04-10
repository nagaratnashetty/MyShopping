package com.myshopping.MyShopping.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;
import java.util.UUID;

@Entity
public class Student {
    @Id
    UUID id;
    String name;
    @OneToMany(mappedBy = "student")
    List<Laptop> laptop;
}
