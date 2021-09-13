package org.example.dao;

import org.example.entity.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
    static final String USER = "root";
    static final String PASSWORD = "zxl20010802";

    public int fun(Users user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", USER, PASSWORD);
            //3.获取预编译的数据库操作对象
            preparedStatement = connection.prepareStatement("insert into register (userName, passWord, sex, email) values (?, ?, ?, ?)");
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            preparedStatement.setString(3, user.getSex());
            preparedStatement.setString(4, user.getEmail());
            //4.执行SQL
            count = preparedStatement.executeUpdate();
            if (1 == count) {
                System.out.println("插入成功!");
            }
            //5.处理结果集
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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