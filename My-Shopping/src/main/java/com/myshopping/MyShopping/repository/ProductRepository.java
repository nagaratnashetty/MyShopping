package com.myshopping.MyShopping.repository;

import com.myshopping.MyShopping.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
@Query(value="SELECT * FROM product  where category=:category and name=:name ",nativeQuery = true)
    public List<Product> getProductsByCategoryAndName(String category, String name);
    @Query(value="SELECT * FROM product  where category=:category ",nativeQuery = true)
    public List<Product> getProductsByCategory(String category);
    @Query(value="SELECT * FROM product  where name=:productName ",nativeQuery = true)
    public List<Product> getProductsByName( String productName);
}