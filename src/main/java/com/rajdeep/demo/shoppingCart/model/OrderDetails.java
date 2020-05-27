package com.rajdeep.demo.shoppingCart.model;

import javax.persistence.Entity;

@Entity
public class OrderDetails {

    private String id;
    private Order order;
    private Product product;
    private int quantity;

    public OrderDetails(String id, Order order, Product product, int quantity){
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
