package org.example.controller;

import org.example.dao.JDBC;
import org.example.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class first_servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        resp.getWriter().print("<h1>test</h1></br><h2>test</h2></br><h3>test</h3></br><h4>test</h4>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");

        //req.getRequestDispatcher("/");

        JDBC jdbc = new JDBC();
        Users user = new Users(null, userName, passWord, sex, email);

        int result = jdbc.fun(user);
        if (1 == result) {
            resp.getWriter().print("<style type='text/css'> #pp{font-size: 30px;color: red;}</style><center><p id='pp'>添加成功!</p></center>");
        } else {
            resp.sendRedirect("http://localhost:8080/java_web?error=yes");
        }
    }
}
