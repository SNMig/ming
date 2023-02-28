package com.javabase.week4day004;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Job1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/educatesystem","root","123456");
//            System.out.println(connection);
//            String sql="INSERT INTO class(name)values('五班')";
           //Statement statement= connection.createStatement();

            //ResultSet rs= statement.executeQuery("select name from class");
//            while (rs.next()){
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getString(1));
//            }
            //statement.execute(sql);


            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO class(name)values(?)");
            preparedStatement.setString(1,"6班");
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
