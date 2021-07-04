/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 * This class will be allowing us to connect to the database and to perform operations on the database
 */
public class DBUtils {
    static String host="jdbc:mysql://localhost:3306/";
    //Connection object is the actual connection to the database
    public static Connection connectToDB(String database_name){
        Connection con=null;
        try {
            //MySQL or SQL Server or Oracle
            //load the DB drivers -
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connect to the database
            con=DriverManager.getConnection(host+database_name+"?useSSL=false", "root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cannot Load Drivers");
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cannot Connect to the Database");
        }
        return con;
        //if we have a problem then con will be null
    }
}
