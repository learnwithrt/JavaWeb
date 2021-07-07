/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.neubao.utils.DBUtils;

/**
 *
 * @author rahul
 */
public class CartDao {

    public boolean addToCart(String uname, int prod_id) {
        boolean saved = false;//this is the result of you trying to save the customer data
        //get the connection
        Connection con = DBUtils.connectToDB("neubao");
        if (con != null) {
            try {
                //you are successfully connected to the database
                ResultSet rs = con.prepareStatement("select * from Cart where user_name='" + uname + "'AND id=" + prod_id).executeQuery();
                int qty = 1;
                PreparedStatement state=null;
                //System.out.println("REsult "+rs.getString("user_name"));
                if (rs.next())//the product exists
                {
                    System.out.println("Inside");
                    state = con.prepareStatement("update cart set qty=? where user_name=? AND id=?");
                    
                    state.setInt(1, rs.getInt("qty")+1);
                    state.setString(2, uname);
                    state.setInt(3, prod_id);
                } else {
                    state = con.prepareStatement("insert into Cart(user_name,id,qty) values(?,?,?)");
                    state.setString(1, uname);
                    state.setInt(2, prod_id);
                    state.setInt(3, 1);
                    
                }
            if (state.executeUpdate() != 0) {
                        saved = true;//save was successfull
                    }
                con.close();//close the connection
            } catch (SQLException ex) {
                System.out.println("Cannot create Statement object");
                ex.printStackTrace();
            }
        }
        return saved;
    }
}
