package com.rajdeep.demo.shoppingCart.controller;

import com.rajdeep.demo.shoppingCart.exception.ProductNotFoundException;
import com.rajdeep.demo.shoppingCart.model.Product;
import com.rajdeep.demo.shoppingCart.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingController{

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/calculateBill/{customerType}")
    public double getCustomerBillAmount(@PathVariable("purchaseAmount") double purchaseAmount,
                                       @PathVariable("customerType") String customerType){
        return shoppingService.getCustomerBillAmount(purchaseAmount, customerType);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return shoppingService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId) throws ProductNotFoundException{
        return shoppingService.getProduct(productId);
    }

    @PostMapping("/product")
    public Product addProduct(@Valid @RequestBody Product product) {
        return shoppingService.addProduct(product);
    }
}
