package com.aman.hack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue
    private long id;
    private String itemName;
    private int itemWeight;
    private int itemHeight;
    private int itemLength;
    private int itemBreadth;
    private Boolean fragile;

    public Item() {
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(int itemHeight) {
        this.itemHeight = itemHeight;
    }

    public int getItemLength() {
        return itemLength;
    }

    public void setItemLength(int itemLength) {
        this.itemLength = itemLength;
    }

    public int getItemBreadth() {
        return itemBreadth;
    }

    public void setItemBreadth(int itemBreadth) {
        this.itemBreadth = itemBreadth;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
