package com.lovish.electricitybillingsystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement st;
    public Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "lovish1711");
            st = c.createStatement();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
