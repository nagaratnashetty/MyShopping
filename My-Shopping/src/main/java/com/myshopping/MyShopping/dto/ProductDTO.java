package com.myshopping.MyShopping.dto;

import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDTO {
    UUID id;
    String productName;
    String productCategory;
    String rating;
    String description;
    String sellerName;
    int price;
}
