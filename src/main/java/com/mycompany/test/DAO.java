/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1-krai
 */
public class DAO {
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "TestDatabase";
    private static final String USERNAME = "2022d_KRai";
    private static final String PASSWORD = "R4bVLQcB5CcqxNr2";
    
    public static void createTable(){ //method to create table
        try(Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD)) { // "fix imports" if red line under
            System.out.println("CONNECTION MADE!"); //to find any errors
            Statement statement = con.createStatement();
            //creates table
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name CHAR(50), phone INTEGER, email CHAR(50))");
            //statement.execute("DROP TABLE contacts");
        } catch (SQLException e) {
            System.out.println("SOEMTHING WENT WRONG..." + e.getMessage()); //error output message 
        }
    }
    
}
