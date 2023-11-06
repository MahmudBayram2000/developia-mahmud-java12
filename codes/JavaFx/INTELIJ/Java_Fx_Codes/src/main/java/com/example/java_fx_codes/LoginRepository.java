package com.example.java_fx_codes;

import java.sql.*;

public class LoginRepository {
    public boolean checkUser(String username, String password) throws SQLException {
        boolean result = false;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?useSSL=false", "root", "mahmud050");

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select count(*) from teachers where " + "username='" + username
                + "' and password='" + password + "';");
        rs.next();
        int r = rs.getInt(1);
        connection.close();
        result = r == 1 ? true : false;
        return result;
    }

}