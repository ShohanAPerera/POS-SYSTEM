/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.*;



/**
 *
 * @author shoan
 */
public class db {
    
    public static Connection mycon (){
            Connection con = null; 
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection ("jdbc:mysql://localhost/pos","root","");
                return con;
            }catch (ClassNotFoundException | SQLException e)
            {
                System.out.println(e);
                return null;
            }
    }
    
}
