package com.myshopping.MyShopping.models;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class OrderTable {
    // Particular order can have multiple products
    // Order table vs product table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID orderId;
    int totalPrice;
    int totalQuantity;
    // Buyer is a User Only -> We need to maintain relationship between user table and order table
    // from order table point of view what kind of relationship it looks like
    @ManyToOne
    AppUser user;

    @OneToMany
    // Becaus of one to many annotation another table will get created which
    // orderID vs ProductId
    // and this table will maintain details like what are products that are present in
    // a particular oder
    List<Product> products;
    String status; // Delivered, In Transit, Returned, Cancelled
    String paymentMode; // UPI, DebitCard, COD

    public OrderTable(UUID orderId, int totalPrice, int totalQuantity, AppUser user, List<Product> products, String status, String paymentMode) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
        this.user = user;
        this.products = products;
        this.status = status;
        this.paymentMode = paymentMode;
    }

    public OrderTable() {
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}