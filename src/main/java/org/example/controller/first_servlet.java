package org.example.controller;

import org.example.dao.JDBC;
import org.example.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.awt.SystemColor.window;

public class first_servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        String userID = req.getParameter("userID");
        String passWord = req.getParameter("passWord");

        System.out.println(userID+","+passWord);

        JDBC jdbc = new JDBC();
        Users user = new Users(userID, passWord);

        int result = jdbc.fun(user);
        if (1 == result) {
            resp.getWriter().print("<script>alert('登陆成功')</script>");
        } else {
            resp.getWriter().print("<script>alert('登陆失败')</script>");

        }
    }
}
