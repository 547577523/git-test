package org.example.dao;

import org.example.entity.Users;

import java.sql.*;

public class JDBC {
    static final String USER = "root";
    static final String PASSWORD = "messi";

    public int fun(Users user) {
        Connection connection = null;
        Statement stml = null;
        ResultSet rs = null;
        int count = 0;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/people", USER, PASSWORD);
            //connection = DriverManager.getConnection("jdbc:mysql://10.17.132.30:3306/people", USER, PASSWORD);
            stml = connection.createStatement();
            String sql;
            sql = "select * from login where login_id='"+user.getUserID()+"' and login_password='"+user.getPassWord()+"'";
            rs = stml.executeQuery(sql);
            if(rs.next()){
                count = 1;
            }
            if (1 == count) {
                System.out.println("登录成功!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return count;
    }
}