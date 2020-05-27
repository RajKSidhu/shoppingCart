package com.rajdeep.demo.shoppingCart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{

    private Long product_id;

    public ProductNotFoundException(Long product_id) {
        super(String.format("Product is not found with id : '%s'", product_id));
    }
}
