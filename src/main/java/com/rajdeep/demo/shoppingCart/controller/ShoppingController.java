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

    @GetMapping("/books")
    public List<Product> getAllProducts() {
        return shoppingService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId) throws ProductNotFoundException{
        return shoppingService.getProduct(productId);
    }

    @PostMapping("/book")
    public Product addBook(@Valid @RequestBody Product product) {
        return shoppingService.addProduct(product);
    }
}
