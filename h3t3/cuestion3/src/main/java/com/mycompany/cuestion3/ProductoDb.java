/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestion3;

/**
 *
 * @author Campus FP
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class ProductoDb
{
      static Connection con;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/crud";
    static String user = "root";
    static String pass = "";
   
    
    public static Connection getConnection() throws Exception
    {
        if(con == null)
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user, pass);
        }
        return con;
    }
}
