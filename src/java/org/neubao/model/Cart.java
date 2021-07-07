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
public class Cart {
    private String uname;
    private int product_id;
    private int qty;

    public Cart() {
    }

    public Cart(String uname, int product_id, int qty) {
        this.uname = uname;
        this.product_id = product_id;
        this.qty = qty;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
