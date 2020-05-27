package com.rajdeep.demo.shoppingCart.service;

import com.rajdeep.demo.shoppingCart.exception.ProductNotFoundException;
import com.rajdeep.demo.shoppingCart.model.Product;
import com.rajdeep.demo.shoppingCart.repository.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingService {

    @Autowired
    private ShoppingRepository shoppingRepository;

    /**
     * Method to fetch all the products
     * @return products
     */
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        shoppingRepository.findAll().forEach(products::add);
        return products;
    }

    /**
     * Method to fetch the product based on id
     * @param id id
     */
    public Product getProduct(Long id) throws ProductNotFoundException{
        return shoppingRepository.findById(id).orElseThrow(()-> new ProductNotFoundException(id));
    }

    /**
     * Method to add the product
     * @param product product
     */
    public Product addProduct(Product product) {
        return shoppingRepository.save(product);
    }
}
