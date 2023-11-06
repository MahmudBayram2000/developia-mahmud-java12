package com.example.java_fx_codes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {
    public List<Student> findAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?useSSL=false", "root", "mahmud050");

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from students");
        while (rs.next()) {
            Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),rs.getString("adress"),rs.getString("phone"),rs.getString("email"));
            students.add(s);
        }

        connection.close();

        return students;

    }

}




