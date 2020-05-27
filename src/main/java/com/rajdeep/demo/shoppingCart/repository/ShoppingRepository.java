package com.rajdeep.demo.shoppingCart.repository;

import com.rajdeep.demo.shoppingCart.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepository extends CrudRepository<Product, Long> {
}
