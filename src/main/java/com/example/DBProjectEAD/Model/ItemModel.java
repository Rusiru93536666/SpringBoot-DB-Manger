package com.example.DBProjectEAD.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_item")
public class ItemModel {

    @Id
    @GeneratedValue
    private int itemId;
    private String itemName;
    private double qty;
    private double price;

    public ItemModel() {
    }

    public ItemModel(int itemId, String itemName, double qty, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
