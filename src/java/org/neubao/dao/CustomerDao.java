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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neubao.model.Customer;
import org.neubao.utils.DBUtils;

/**
 *
 * @author rahul
 * Dao-
 *  Performing operations on Customer table
 *  saveCustomer
 * readCustomer
 * searchCustomer
 * deleteCustomer
 */
public class CustomerDao {
    public boolean saveCustomer(Customer cust){
        boolean saved=false;//this is the result of you trying to save the customer data
        //get the connection
        Connection con=DBUtils.connectToDB("neubao");
        if(con!=null){try {
            //you are successfully connected to the database
            PreparedStatement state=con.prepareStatement("insert into customers(user_name,email,password) values(?,?,?)");
            state.setString(1, cust.getUname());
            state.setString(2, cust.getEmail());
            state.setString(3, cust.getPwd());
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
    public boolean checkCustomer(Customer cust){
        boolean validUser=false;
        String id=cust.getUname();
        String pass=cust.getPwd();
        //get the data from the db
        Connection con=DBUtils.connectToDB("neubao");
        if(con!=null){
            //check if this id and password is the same as DB
            try {
                PreparedStatement st=con.prepareStatement("select * from customers where user_name=?");
                st.setString(1, id);
                ResultSet rs=st.executeQuery();
                if(rs.next()){//if there is any data
                    String dbPass=rs.getString("password");
                    if(pass.equals(dbPass))
                        validUser=true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Cannot get the data");
            }
        }
        return validUser;
    }
}
