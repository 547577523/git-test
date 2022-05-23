package org.example.dao;

import java.sql.*;

public class jdbc_test {
    static final String USER = "root";
    static final String PASSWORD = "messi";

    public static void main(String[] args) {
        Connection connection = null;
        Statement stml =null;
        ResultSet rs = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/people", USER, PASSWORD);
            //3.获取预编译的数据库操作对象
            stml = connection.createStatement();
            String sql;
            sql = "select * from login";
            rs = stml.executeQuery(sql);
            //处理结果集
            while(rs.next()){
                int id = rs.getInt("login_id");
                int password = rs.getInt("login_password");
                System.out.println(id+","+password);
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

    }
}
