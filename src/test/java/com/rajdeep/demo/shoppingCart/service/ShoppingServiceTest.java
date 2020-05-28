package com.rajdeep.demo.shoppingCart.service;

import com.rajdeep.demo.shoppingCart.model.Product;
import com.rajdeep.demo.shoppingCart.repository.ShoppingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class ShoppingServiceTest {

    @InjectMocks
    private ShoppingService shoppingService;

    @MockBean
    private ShoppingRepository shoppingRepository;

    @Mock
    private Product product;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
     }

    @Test
    public void getAllProducts(){
        List<Product> products = new ArrayList<Product>();
        Mockito.when(shoppingRepository.findAll()).thenReturn(products);
    }

    @Test
    public void testGetProduct() {
        shoppingRepository.findById(product.getId());
        Assert.assertNotNull(product.getId());
    }

    @Test
    public void testAddProduct(){
        shoppingRepository.save(product);
    }

}
