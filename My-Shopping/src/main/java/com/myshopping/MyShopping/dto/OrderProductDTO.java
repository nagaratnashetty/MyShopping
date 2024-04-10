package com.myshopping.MyShopping.dto;

import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderProductDTO {
    UUID productID;
    String productName;
    int Quantity;
}
