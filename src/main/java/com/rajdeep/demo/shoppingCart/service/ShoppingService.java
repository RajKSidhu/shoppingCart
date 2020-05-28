package com.rajdeep.demo.shoppingCart.service;

import com.rajdeep.demo.shoppingCart.constants.Constants;
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

    public double getCustomerBillAmount(double purchaseAmount, String customerType){
        double billAmount = 0.0;
        double discount, s;
        // checking conditions and calculating discount
        if(customerType.equals(Constants.CUSTOMER_TYPE1))
        {
            if(purchaseAmount>0) {
                if(purchaseAmount<=5000){
                    s = 100-0;
                    billAmount = (s*purchaseAmount)/100;
                }else if(purchaseAmount>=5000 && purchaseAmount<=10000)
                {
                    discount = 0.10 * (10000-5000);
                    billAmount = purchaseAmount - discount;
                }else if(purchaseAmount>=10000)
                {
                    discount = 0.10 * (10000-5000) + 0.20 * (purchaseAmount -10000);
                    billAmount = purchaseAmount - discount;
                }
            }
            else {
                System.out.println("Invalid Amount");
            }
        }else if(customerType.equals(Constants.CUSTOMER_TYPE2)){
            if(purchaseAmount>0) {
                if(purchaseAmount<=4000){
                    s = 100-10;
                    billAmount = (s*purchaseAmount)/100;
                }else if(purchaseAmount>=4000 && purchaseAmount<=8000)
                {
                    discount = 0.10 * 4000 + 0.15 * (8000-4000);
                    billAmount = purchaseAmount - discount;
                }else if(purchaseAmount>=8000 && purchaseAmount<=12000)
                {
                    discount = 0.10 * 4000 + 0.15 * (8000-4000) + 0.20 * (12000-8000);
                    billAmount = purchaseAmount - discount;
                }else if(purchaseAmount>=12000){
                    discount = 0.10 * 4000 + 0.15 * (8000-4000) + 0.20 * (12000-8000) + 0.30 * (purchaseAmount - 12000);
                    billAmount = purchaseAmount - discount;
                }
            }
            else {
                System.out.println("Invalid Amount");
            }
        }
        return billAmount;
    }
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
