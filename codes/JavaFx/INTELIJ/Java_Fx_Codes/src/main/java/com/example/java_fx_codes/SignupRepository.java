package com.example.java_fx_codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SignupRepository {
    public void save(Teacher t) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup", "root", "mahmud050");

        Statement st = connection.createStatement();
        st.executeUpdate("insert into teachers" + " (name,surname,username,adress,email,phone,password) value"
                +"('"+t.getName()+"','"+t.getSurname()
                +"','"+t.getUsername()+"','"+t.getAddress()+"','"+
                t.getEmail()+"','"+t.getPhone()+"','"+t.getPassword()+"');");


        connection.close();

    }

    public boolean checkUsername(String username) throws SQLException {
        boolean result = false;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup", "root", "mahmud050");

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select count(*) from teachers where "
                + "username='" + username + "';");
        rs.next();
        int r = rs.getInt(1);
        connection.close();
        result = r == 1 ? true : false;
        return result;
    }

}

