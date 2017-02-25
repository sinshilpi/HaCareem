package com.aman.hack.model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Order_table")
public class OrderTable {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "source_hub_id")
    private Hub sourceHubId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "destination_hub_id")
    private Hub destinationHubId;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "comp_id")
    private Company compId;
    private Date orderDate;
    private double price;

    public OrderTable(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Hub getSourceHubId() {
        return sourceHubId;
    }

    public void setSourceHubId(Hub sourceHubId) {
        this.sourceHubId = sourceHubId;
    }


    public Hub getDestinationHubId() {
        return destinationHubId;
    }

    public void setDestinationHubId(Hub destinationHubId) {
        this.destinationHubId = destinationHubId;
    }


    public Company getCompId() {
        return compId;
    }

    public void setCompId(Company compId) {
        this.compId = compId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

