package com.aman.hack.model;

import javax.persistence.*;

@Entity
@Table(name = "Order_item")
public class OrderItem {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "order_id")
    private OrderTable orderId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "item_id")
    private Item itemId;
    private double price;

    public OrderItem(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderTable getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderTable orderId) {
        this.orderId = orderId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
