package com.danaapps.atm_project;

import javax.swing.*;
import java.sql.DriverManager;

public class Connection {
    java.sql.Connection connection =null;

    public static java.sql.Connection connectdb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection(
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

