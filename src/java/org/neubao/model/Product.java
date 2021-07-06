/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.model;

/**
 *
 * @author rahul
 */
public class Product {
    private int id;
    private String name;
    private int qty;
    private String description;
    private float price;
    private String seller_id;
    //Default
    public Product() {
    }

    public Product(int id, String name, int qty, String description, float price, String seller_id) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.description = description;
        this.price = price;
        this.seller_id = seller_id;
    }

    public Product(String name, int qty, String description, float price, String seller_id) {
        this.name = name;
        this.qty = qty;
        this.description = description;
        this.price = price;
        this.seller_id = seller_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }
    
}
