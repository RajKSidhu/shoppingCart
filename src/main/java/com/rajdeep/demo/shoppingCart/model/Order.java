package com.rajdeep.demo.shoppingCart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    private Long id;

    private int orderNum;
    private Date orderDate;
    private double amount;

    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;

    public Order(){
    }

    public Order(Long id, int orderNum, Date orderDate, double amount, String customerName, String customerAddress, String customerEmail, String customerPhone){
        this.id = id;
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.amount = amount;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNum=" + orderNum +
                ", orderDate=" + orderDate +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
