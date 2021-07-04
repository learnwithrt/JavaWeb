/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.neubao.model.Product;
import org.neubao.utils.DBUtils;

/**
 *
 * @author rahul
 */
public class ProductDao {
    public boolean addProduct(Product pro){
         boolean saved=false;//this is the result of you trying to save the customer data
        //get the connection
        Connection con=DBUtils.connectToDB("neubao");
        if(con!=null){try {
            //you are successfully connected to the database
            PreparedStatement state=con.prepareStatement("insert into products"
                    + "(name,qty,description,price,seller_id) values(?,?,?,?,?)");
            state.setString(1, pro.getName());
            state.setInt(2, pro.getQty());
            state.setString(3, pro.getDescription());
            state.setFloat(4, pro.getPrice());
            state.setString(5, pro.getSeller_id());
            if(state.executeUpdate()!=0)
                saved=true;//save was successfull
            con.close();//close the connection
            } catch (SQLException ex) {
                System.out.println("Cannot create Statement object");
                ex.printStackTrace();
            }
        }
        return saved;
    }
}
