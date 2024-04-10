package com.myshopping.MyShopping.repository;

import com.myshopping.MyShopping.models.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderTable, UUID> {
}