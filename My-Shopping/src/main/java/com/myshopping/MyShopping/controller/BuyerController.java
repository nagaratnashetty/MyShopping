package com.myshopping.MyShopping.controller;

import com.myshopping.MyShopping.dto.BillDTO;
import com.myshopping.MyShopping.dto.OrderDetailsDTO;
import com.myshopping.MyShopping.models.OrderTable;
import com.myshopping.MyShopping.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    BuyerService buyerService;
    @PostMapping("/placeorder")
    public BillDTO placeOrder(@RequestBody List<OrderDetailsDTO> orders, @RequestParam UUID userId){
        return buyerService.placeOrder(orders, userId);
    }
}