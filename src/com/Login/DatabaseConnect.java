
package com.Login;
import java.sql.*;
import javax.swing.JOptionPane;


public class DatabaseConnect {
    Connection con;
    
    public static Connection ConnectDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/LibraryManagement";
            String user = "root";
            String password = "";
            
            Connection con = DriverManager.getConnection(url,user,password);
            
           return con;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
