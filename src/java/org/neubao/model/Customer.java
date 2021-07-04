/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.model;

/**
 *
 * @author rahul
 * Model class
 */
public class Customer {
    private String uname;
    private String email;
    private String pwd;
    //Default constructor
    public Customer() {
    }

    public Customer(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }
    //Paramterized Constructor
    public Customer(String uname, String email, String pwd) {
        this.uname = uname;
        this.email = email;
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
