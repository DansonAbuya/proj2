package com.apps.myapp.utilities;
import java.sql.*;
import javax.swing.*;
public class MyConnections {
    Connection connection =null;

        public static Connection connectdb()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/ATM_DATABASE","root","Dansonom5");
                return conn;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
    }

