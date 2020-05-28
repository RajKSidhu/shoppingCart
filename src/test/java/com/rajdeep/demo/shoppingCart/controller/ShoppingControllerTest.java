package com.rajdeep.demo.shoppingCart.controller;

import com.rajdeep.demo.shoppingCart.model.Order;
import com.rajdeep.demo.shoppingCart.model.OrderDetails;
import com.rajdeep.demo.shoppingCart.model.Product;
import com.rajdeep.demo.shoppingCart.service.ShoppingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
public class ShoppingControllerTest {

    @InjectMocks
    private ShoppingController shoppingController;

    @MockBean
    private ShoppingService shoppingService;

    @MockBean
    private Product product;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllProducts(){
        List<Product> listProduct = new ArrayList<Product>();
        Mockito.when(shoppingService.getAllProducts()).thenReturn(listProduct);
        Assert.assertNotNull(listProduct);
    }

    @Test
    public void testGetProduct() {
        shoppingService.getProduct(product.getId());
    }

    @Test
    public void testAddProduct(){
        shoppingService.addProduct(product);
    }
}
